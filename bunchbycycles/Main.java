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
int a[]= {100,200,350,450,550,1000};
  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
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
        CountsByUsage.lowCount++;
      }
      else if(a[i]>310 && a[i]<930)
      {
        CountsByUsage.mediumCount++;
      }
      else
      {
        CountsByUsage.highCount++;
      }
    }
  }
}
