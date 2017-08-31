package com.aruna;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.jayway.restassured.RestAssured;
import static com.jayway.restassured.RestAssured.when;
import com.jayway.restassured.http.ContentType;

@RunWith(SpringJUnit4ClassRunner.class) // 1
@SpringApplicationConfiguration(classes = CharacterApplication.class) // 2
@WebAppConfiguration // 3
@IntegrationTest("server.port:0") // 4
public class CharacterControllerIT {

	private static final String NAME_FIELD = "name";
	private static final String CHARACTERS_RESOURCE = "/api/characters";
	private static final String CHARACTER_RESOURCE = "/api/characters/{id}";

	// Mickey, Goofy, Tiana, Simba, McDuck

	private static final String FIRST_CHARACTER_NAME = "Mickey";
	private static final String SECOND_CHARACTER_NAME = "Goofy";
	private static final String THIRD_CHARACTER_NAME = "Simba";

	private static final Character FIRST_CHARACTER = new CharacterBuilder().name(FIRST_CHARACTER_NAME).build();
	private static final Character SECOND_CHARACTER = new CharacterBuilder().name(SECOND_CHARACTER_NAME).build();
	private static final Character THIRD_CHARACTER = new CharacterBuilder().name(THIRD_CHARACTER_NAME).build();

	@Autowired
	private CharacterRepository characterRepository;

	@Value("${local.server.port}")
	private int serverPort;
	private Character firstCharacter;
	private Character secondCharacter;

	@Before
	public void setUp() {
		characterRepository.deleteAll();
		firstCharacter = characterRepository.save(FIRST_CHARACTER);
		secondCharacter = characterRepository.save(SECOND_CHARACTER);
		RestAssured.port = serverPort;
	}

	@Test
	public void addItemShouldReturnSavedItem() {
		given().body(THIRD_CHARACTER).contentType(ContentType.JSON).when().post(CHARACTERS_RESOURCE).then()
				.statusCode(HttpStatus.SC_OK).body(NAME_FIELD, is(THIRD_CHARACTER_NAME));
		System.out.println("addItemShouldReturnSavedItem completed !!!");
	}

	@Test
	public void updateItemShouldReturnUpdatedItem() {
		// Given an unchecked first item
		Character item = new CharacterBuilder().name(FIRST_CHARACTER_NAME).build();
		given().body(item).contentType(ContentType.JSON).when().put(CHARACTER_RESOURCE, firstCharacter.getId()).then()
				.statusCode(HttpStatus.SC_OK).body(NAME_FIELD, is(FIRST_CHARACTER_NAME));
	}

	@Test
	public void getItemsShouldReturnBothItems() {
		when().get(CHARACTERS_RESOURCE).then().statusCode(HttpStatus.SC_OK).body(NAME_FIELD,
				hasItems(FIRST_CHARACTER_NAME, SECOND_CHARACTER_NAME));
	}

	@Test
	public void deleteItemShouldReturnNoContent() {
		when().delete(CHARACTER_RESOURCE, secondCharacter.getId()).then().statusCode(HttpStatus.SC_NO_CONTENT);
	}
}