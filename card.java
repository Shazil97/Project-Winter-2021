package com.company.weeks;

public class card {
    private String faceName;
    private int faceValue;
    private String suit;

    /**
     * This is the cunstructor. It does not have a return type,
     * and the name must be exactly the same as the classs name (including the upper case letter)
     * you can have overloaded cunstructor
     * @param faceName -example ace
     * @param suit - example spade
     * @param facevalue - eample 14
     */

    /*
    there is no return type for cunstructor
    card is a class name we will declare this openly in cunstructor.
    overloaded methods or overloaded cunstructor means multiple cunstructor with same name but different parameters
    same name different argument
     */

    public card(String faceName, String suit, int facevalue){  /* these are different cunstructor */
        setFaceName(faceName); /* these are methods declared in class  */
        setSuit(suit);
        setFaceVale(faceValue);

    }

    /**
     * this cunstructor should be used if you want ace's to be the highest card in value
     * @param faceName
     * @param suit
     */

    /* default value will be high because we are not paassing a certain value */

    public card (String faceName, String suit){
        this.faceName = faceName;
        this.suit = suit;
    }
    /**
     * This constructor should be used if you want ace's to be the highest card value
     * @param faceName
     * @param suit
     */
    public card(String faceName, String suit){
        this.faceName = faceName;
        public String getSuit(){
            this.suit = suit;
        }
    }
    public void setFaceName(int faceValue)

        public void setSuit (String suit){
        this.suit = suit;
        }
    /**
     * This method will return a String that represesnt
     * the card with the face name and suite
     */
    public String toString()
    {
        return faceName + " of " + suit;
    }
/**
 * This method will return an Array List of valid suit names
 * @return a list of String objects that reflect valid suit names
 */
public static ArrayList<String> getValidSuits()
{
    ArrayList<String> suits = Array.asList ("Spades", "Clubs", "Hearts", "Diamond");
}
public void setSuit(String suit) {
    if (getValidSuits().contains(suits))
        this.suit = suit;
    else
        throw new IllegalArgumentsException("valid suites are: "+getValidSuits());
}
}

