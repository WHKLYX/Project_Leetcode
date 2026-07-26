import java.util.Scanner;
import java.util.Arrays;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
        // 查看 IntelliJ IDEA 建议如何修正。
        System.out.print("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP 按 <shortcut actionId="Debug"/> 开始调试代码。我们已经设置了一个 <icon src="AllIcons.Debugger.Db_set_breakpoint"/> 断点
            // 但您始终可以通过按 <shortcut actionId="ToggleLineBreakpoint"/> 添加更多断点。
            System.out.println("i = " + i);
        }

        // 输入语句的用法 以及 switch 语句的用法
//         Scanner scanner = new Scanner(System.in);
//        System.out.print("请输入一个整数: ");
//        int number = scanner.nextInt();
//        switch (number){
//            case 1:
//                System.out.print("匹配到1");
//                break;
//            case 2:
//                System.out.print("匹配到2");
//                break;
//            default:
//                System.out.print("未匹配到结果");
//                break;
//        }

        Solution_Twonum();

    }

    public static void Solution_Twonum() {

        int[] arr;
        arr = new int[]{3, 2, 4};
        int target = 9;
        // 初始化寻找数据
        int research_num_1,  research_num_2;

        // 返回当前数据的位置
        int[] data_place = new int[2];
        int[] data_place_value = new int[2];

        System.out.print("数组长度 = " + arr.length);
        System.out.print('\n');

        // 然后对target进行排序组合
        for (int j = 0; j < arr.length; j++) {
            // 设立寻找标志位，若找到 则返回1结束外循环
            int find_flag = 0;
            // 从第0个开始找，一个一个遍历
            research_num_1 = arr[j];
            // 得到需要的数据;
            research_num_2 = target - research_num_1;
            // 开始遍历 如果第一次遍历完没有合适的，后续不需要再遍历前面的
            for (int i = j + 1; i < arr.length; i++) {
                if (research_num_2 == arr[i]) {
                    data_place[0] = j;
                    data_place_value[0] = arr[j];
                    data_place[1] = i;
                    data_place_value[1] = arr[i];
                    find_flag = 1;
                    break;
                }
            }

            if (find_flag == 1) {
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data_place_value[0]){
                data_place[0] = i;
            }

            if (arr[i] == data_place_value[1]){
                data_place[1] = i;
            }
        }
    }
}


