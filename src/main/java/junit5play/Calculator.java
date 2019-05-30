package junit5play;

final class Calculator {

  public int add(final int... toAdd) {
    int rtnVal = 0;
    for (final int i : toAdd) {
      rtnVal += i;
    }
    return rtnVal;
  }

}
