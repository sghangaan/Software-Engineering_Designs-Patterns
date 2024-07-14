

public class Knight implements CharacterType {
    SwingSword swingAtk = new SwingSword();
    Shield shieldDefense = new Shield();
    Dodge dodgeDefense = new Dodge();
    CreateMagic magicBarrier = new CreateMagic();

    @Override
    public String characterAttack() {
        return "\tKnight " + swingAtk.attack();
    }

    @Override
    public String characterDefense() {
        return shieldDefense.defense() + "\n" + dodgeDefense.defense() + "\n" + magicBarrier.defense();
    }
}
