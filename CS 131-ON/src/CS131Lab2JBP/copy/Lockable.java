package CS131Lab2JBP.copy;

/**
* interface Lockable
*/
public interface Lockable {

/**
* setKey() method
*/
void setKey(int key);

/**
* lock() method
*/
void lock(int key);

/**
* unlock() method
*/
void unlock(int key);

/**
* isLocked() method
*/
boolean isLocked();

}