package fr.florian.snakegame.objects;

public class Player<T,U,V>
{
    private T pseudo;
    private U health;
    private V attack;

    public Player(T pseudo, U health, V attack)
    {
        this.pseudo = pseudo;
        this.health = health;
        this.attack = attack;
    }

    public T getPseudo()
    {
        return this.pseudo;
    }

    public void setPseudo(T pseudo)
    {
        this.pseudo = pseudo;
    }

    public U getHealth()
    {
        return this.health;
    }

    public void setHealth(U health)
    {
        this.health = health;
    }

    public V getAttack()
    {
        return this.attack;
    }

    public void setAttack(V attack)
    {
        this.attack = attack;
    }
}
