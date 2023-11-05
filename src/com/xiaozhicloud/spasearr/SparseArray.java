package src.com.xiaozhicloud.spasearr;

//
public class SparseArray {
  public static void main(String[] args) {
    int chessArr[][] = new int[11][11];
    chessArr[1][2]= 1;
    chessArr[2][3] = 2;
    // 原如的二维数组
    System.out.println("原如二维数组");
    for (int[] row:chessArr) {
      for (int data:row) {
        System.out.printf("%d\t",data);
      }
      System.out.println();
    }
    int sum = 0;
    for(int [] row:chessArr) {
      for(int data:row) {
        if(data!=0) {
          sum++;
        }
      }
    }
    System.out.println(sum);

    // 创建对应的稀疏数组
    int count = 0;
    int sparseArr[][] = new int[sum+1][3];
    for(int i=0;i < 11;i++) {
      for(int j=0;j < 11;j++) {
        if(chessArr[i][j]!=0) {
          count++;
          sparseArr[count][0] = i;
          sparseArr[count][1] = j;
          sparseArr[count][2] = chessArr[i][j];
        }
      }
    }

    // 输出頹疏数组的形式
    System.out.println();
    for(int i=0; i < sparseArr.length;i++) {
      System.out.printf("%d\t%d\t%d\t\n",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
    }

  }
}
