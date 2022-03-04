package apiGeneric;

/**
 * Inbounded type only one class but more than one interface are allowed in a combination 
 * of Interface and Class.
 * In this case class will come first then Interface.
 * @author Yashwani
 *
 * @param <T>
 */

public class Case5<T extends A & X & Y> {

}
