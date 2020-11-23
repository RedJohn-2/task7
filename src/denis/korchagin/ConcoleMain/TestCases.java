package denis.korchagin.ConcoleMain;

public class TestCases {
    private int currentResult;
    private int[] testArr;

    public TestCases(int currentResult, int[] testArr) {
        this.currentResult = currentResult;
        this.testArr = testArr;
    }

    public int[] getTestArr() {
        return testArr;
    }

    public int getCurrentResult() {
        return currentResult;
    }
}
