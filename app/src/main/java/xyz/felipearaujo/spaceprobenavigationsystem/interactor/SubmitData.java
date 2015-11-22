package xyz.felipearaujo.spaceprobenavigationsystem.interactor;

import rx.Observable;
import xyz.felipearaujo.spaceprobenavigationsystem.entity.Ship;

public interface SubmitData {
  Observable<String> execute(String email, Ship ship);
}
