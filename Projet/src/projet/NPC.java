package projet;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package projet;

/**
 *
 * @author Camille
 */
public abstract class NPC {
    private final String NAME;
    private boolean isActive;
    private Item ITEM;
    private final String Question;
    private final String Answer;
    
    public NPC(String name,Item item,String Question,String Answer){
        this.NAME=name;
        this.isActive=true;
        this.ITEM=item;
        this.Question=Question;
        this.Answer=Answer;
    }
    
    public void give_Item(Hero hero){
            hero.getBag().addItem(this.ITEM); //POUVOIR RECUPERER LE SAC DU HERO dans le HERO pour ajouter element à son sac
            this.ITEM=null;
    }

    public void verifyAnswer(String answer){
        if(this.Answer.equals(answer)){
            this.isActive=false;
        }
    }
    
    public boolean isActive(){
        return this.isActive;
    }
    
    
    //faire plusieurs perso avec un pouvoir juste comme augmenter l'argent etc..
    
}

