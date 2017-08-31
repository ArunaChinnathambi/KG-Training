package com.aruna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/characters")
class CharacterController {
 	
    @Autowired
    private CharacterRepository characterRepository;
    
    @RequestMapping(method=RequestMethod.POST)
	public Character create(@RequestBody Character character)
	{
    	character.setId(null);
		return characterRepository.saveAndFlush(character);
	}
    
    @RequestMapping(value="{id}",method=RequestMethod.PUT)
	public Character update(@PathVariable Integer id,@RequestBody Character updatedcharacter)
	{	
		Character character = characterRepository.getOne(id);
		character.setName(updatedcharacter.getName());
	    return characterRepository.saveAndFlush(character);
	}
 
    @RequestMapping(method=RequestMethod.GET)
    List<Character> read() {
        return characterRepository.findAll();
    }
 
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable("id") Integer id) {
    	characterRepository.delete(id);
    }
}

