

public class Character {
    private CharacterType charClass;

    public Character(CharacterType charClass){
        this.charClass = charClass;
    }

    public String characterAtk(){
        return charClass.characterAttack();
    }

    public String characterDef(){
        return charClass.characterDefense();
    }
}
