package 黒本.chap13.Q77;

public class Sample {
    public static void test(int num) throws SampleException {
        if(num < 0) {
            throw new SubSampleException();
        }
    }
}
