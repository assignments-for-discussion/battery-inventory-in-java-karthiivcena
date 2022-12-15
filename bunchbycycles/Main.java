package bunchbycycles;

public class Main {
  static class CountsByUsage {
    public int lowCount = 0;
    public int mediumCount = 0;
    public int highCount = 0;
  };

  static CountsByUsage countBatteriesByUsage(int[] cycles) {
    CountsByUsage counts = new CountsByUsage();
    return counts;
  }

  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    //Adding a new variable for simplifying the code.
    int a[]= {100,200,350,450,550,1000};
    
    CountsByUsage counts = countBatteriesByUsage(a);
    assert(counts.lowCount == 2);
    assert(counts.mediumCount == 3);
    assert(counts.highCount == 1);
    System.out.println("Done counting :)\n");
  }

  public static void main(String[] args) {
    testBucketingByNumberOfCycles();
    for(int i=0;i<a.length();i++)
    {
      if(a[i]<=310)
      { 
        lowCount++;
      }
      else if(a[i]>310 && a[i]<930)
      {
        mediumCount++;
      }
      else
      {
        highCount++;
      }
    }
  }
}
