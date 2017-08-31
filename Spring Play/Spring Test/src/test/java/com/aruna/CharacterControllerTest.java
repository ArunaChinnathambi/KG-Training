package com.aruna;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class CharacterControllerTest {

	private static final int CHARACTER_ID = 1;
	private static final Character EXISTING_CHARACTER = new CharacterBuilder().id(CHARACTER_ID).name("Micky").build();
	private static final Character ANOTHER_CHARACTER = new CharacterBuilder().id(2).name("Minny").build();
	private static final Character NEW_CHARACTER = new CharacterBuilder().name("Micky").build();

	@InjectMocks
	private CharacterController characterController;
	@Mock
	private CharacterRepository characterRepository;

	@Test
	public void whenCreatingCharacterItShouldReturnTheSavedCharacter() {
		given(characterRepository.saveAndFlush(NEW_CHARACTER)).willReturn((EXISTING_CHARACTER));
		assertThat(characterController.create((NEW_CHARACTER))).isSameAs(EXISTING_CHARACTER);
	}

	@Test
	public void whenUpdatingCharacterItShouldReturnTheSavedCharacter() {
		given(characterRepository.getOne(CHARACTER_ID)).willReturn(EXISTING_CHARACTER);
		given(characterRepository.saveAndFlush(EXISTING_CHARACTER)).willReturn(EXISTING_CHARACTER);
		assertThat(characterController.update(CHARACTER_ID, EXISTING_CHARACTER)).isSameAs(EXISTING_CHARACTER);
	}

	@Test
	public void whenReadingdingCharacterItShouldReturnAllCharacters() {
		given(characterRepository.findAll()).willReturn(Arrays.asList(EXISTING_CHARACTER, ANOTHER_CHARACTER));
		assertThat(characterController.read()).containsOnly(EXISTING_CHARACTER, ANOTHER_CHARACTER);
	}

	@Test
	public void whenDeletingACharacterItShouldUseTheRepository() {
		characterController.delete(CHARACTER_ID);
		verify(characterRepository).delete(CHARACTER_ID);
	}

}