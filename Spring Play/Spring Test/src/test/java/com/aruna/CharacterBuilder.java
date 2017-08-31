package com.aruna;

public class CharacterBuilder {
  private Character character = new Character();
  
  public CharacterBuilder id(int id) {
	  character.setId(id);
    return this;
  }
  
  public CharacterBuilder name(String name) {
	  character.setName(name);
    return this;
  }
  
  public Character build() {
    return character;
  }
}