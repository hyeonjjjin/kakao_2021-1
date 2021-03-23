import java.lang.*;

class Solve {
    public static void main(String[] args) {
        System.out.println(solution1("-_.~!@#$%^&*()=+[{]}:?,<>/"));
        String[] orders= {"ACFG", "ABC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course= {2,3,4};
        solution2(orders,course);
    }
    public static String solution1(String new_id) {
        String[] delete = {"~","!","@","#","\\$","%","\\^",",","&","\\*","\\(","\\)","\\+","=","\\\\","\\{","\\}","\\[","\\]",":","<",">","\\?","/"};
        System.out.println(new_id);
        //1단계
        new_id= new_id.toLowerCase();
        //2단계
        for (String item : delete) new_id=new_id.replaceAll(item,"");
        //3단계
        StringBuffer temp_id= new StringBuffer(new_id);
        int dot_start = temp_id.indexOf("..");
        int dot_end = dot_start+1;
        while(dot_start >=0){
            while((dot_end<temp_id.length()-1)&&(temp_id.charAt(dot_end+1)=='.')) dot_end++;
            temp_id=temp_id.delete(dot_start, dot_end);
            dot_start = temp_id.indexOf("..");
            dot_end = dot_start+1;
        }
        //4단계
        if(temp_id.charAt(0)=='.') temp_id=temp_id.deleteCharAt(0);
        if(temp_id.length()>=1&& temp_id.charAt(temp_id.length()-1)=='.') temp_id=temp_id.deleteCharAt(temp_id.length()-1);
        //5단계
        if(temp_id.length()==0) temp_id.insert(0,'a');
        //6단계
        if(temp_id.length()>=16) temp_id=temp_id.delete(15, temp_id.length());
        if(temp_id.length()>=1&& temp_id.charAt(temp_id.length()-1)=='.') temp_id=temp_id.deleteCharAt(temp_id.length()-1);
        //7단계
        while(temp_id.length()<3) temp_id.insert(temp_id.length(),temp_id.charAt(temp_id.length()-1));
        return temp_id.toString();
    }
    //["ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"] [2,3,4]
    public static String[] solution2(String[] orders, int[] course) {
        //두 개씩 조합해주는 함수는 없었나 혹쉬...?
        StringBuffer compare1=new StringBuffer();
        compare1.append(orders[0].charAt(0));
        compare1.append(orders[0].charAt(1));

        StringBuffer compare0=new StringBuffer(orders[1]);
        System.out.println(compare0.indexOf(compare1.toString()));
        //뭐야 어케하는데
        //System.out.println(compare);
        //String s = orders[0].charAt(0)+orders[0].charAt(0);
        //idontknow.......
        System.out.println();
        //String tmp = s[0]+s[1];

        String[] answer = {};
        return answer;
    }
    public static String solution1_O(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase();//1단계
        new_id = new_id.replaceAll("[^-_.a-z0-9]","");//2단계
        new_id = new_id.replaceAll("[.]{2,}",".");//3단계
        new_id = new_id.replaceAll("^[.]|[.]$","");//4단계
        if(new_id.equals("")) new_id+="a";//5단계
        if(new_id.length() >=16){
            new_id = new_id.substring(0,15);//6단계
            new_id = new_id.replaceAll("^[.]|[.]$","");
        }
        while(new_id.length()<=2)//7단계
            new_id+=new_id.charAt(new_id.length()-1);
        return new_id;
    }

    //2018 KAKAO BLIND REQUIREMENT [3차]
    //level2
    public static String solution(int n, int t, int m, int p) {
        String answer = "";
        return answer;
    }
}
