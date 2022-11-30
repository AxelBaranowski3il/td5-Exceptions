package Ex13;

import java.lang.Exception;

public class DateException extends Exception  {

  public DateException(int jour, int mois, int annee){
    super(jour + "/" + mois + "/" + annee + " n'est pas une date valide");
  }
}