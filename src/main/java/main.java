/**
 * @author: xiong
 * @time: 2017/11/29
 * @说明:
 */
public class main {

    public static void main(String[] args) {
//        ChineseToPinYinUtil mChineseToPinYin = new ChineseToPinYinUtil();
//        System.out.println(mChineseToPinYin.toHanyuPinyin("多发的发独守空房阿道夫打发第三方"));
        int i = 17;
        String str = Integer.toBinaryString(i);
        int count = str.length() - 1;
        if (Math.pow(2, count) < Integer.valueOf(str)) {
            count += 1;
        }
        System.out.println(count);
    }

}


