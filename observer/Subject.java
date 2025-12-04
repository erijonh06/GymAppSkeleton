package com.gym.observer;

/**
 * Subject Interface (Observer Pattern)
 * -------------------------------------
 * A Subject manages a list of observers and notifies them of state changes.
 * 
 * addObserver()    → register an observer
 * removeObserver() → unregister an observer
 * notifyObservers() → push updates to all observers
 */
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}
