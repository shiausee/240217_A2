
package com.uum.a2._a2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class count {

    int numCom = 0;
    int numBlank = 0;
    int lineOfcode = 0;
    int actualLOC = 0;
    int keyNumber = 0;
    
    public count() {
    }
 
    public int comment(String comment) {
        if ((comment.contains("//")) || (comment.contains("/*"))) {
            numCom++;
        }
        return numCom;
    }

    public int blank(String comment) {
        if (comment.equals("")) {
            numBlank++;
        }
        return numBlank;
    }

    public int lineOfCode(String comment) {
        if (comment != ("")) {
            lineOfcode++;
        }
        return lineOfcode;
    }

    public int actualLOC(int lineOfCode, int numblank, int comment) {
        actualLOC = lineOfcode - numBlank - numCom;
        return actualLOC;
    }

    public int keyword(String path) throws FileNotFoundException, IOException {
        String st;
        File files = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(files));
        int keyNum = 0;
        int keyWord[] = new int[53];
        while ((st = br.readLine()) != null) {
            if (st.contains("class")) {
                keyNum++;
            }
            if (st.contains("if")) {
                keyNum++;
            }
            if (st.contains("extends")) {
                keyNum++;
            }
            if (st.contains("abstract")) {
                keyNum++;
            }
            if (st.contains("assert")) {
               keyNum++;
            }
            if (st.contains("boolean")) {
               keyNum++;
            }
            if (st.contains("break")) {
                keyNum++;
            }
            if (st.contains("byte")) {
                keyNum++;
            }
            if (st.contains("case")) {
                keyNum++;
            }
            if (st.contains("catch")) {
                keyNum++;
            }
            if (st.contains("char")) {
                keyNum++;
            }
            if (st.contains("continue")) {
                keyNum++;
            }
            if (st.contains("default")) {
                keyNum++;
            }
            if (st.contains("do")) {
                keyNum++;
            }
            if (st.contains("else")) {
                keyNum++;
            }
            if (st.contains("enum")) {
                keyNum++;
            }
            if (st.contains("final")) {
                keyNum++;
            }
            if (st.contains("finally")) {
                keyNum++;
            }
            if (st.contains("float")) {
                keyNum++;
            }
            if (st.contains("for")) {
                keyNum++;
            }
            if (st.contains("implements")) {
                keyNum++;
            }
            if (st.contains("import")) {
                keyNum++;
            }
            if (st.contains("instanceof")) {
                keyNum++;
            }
            if (st.contains("int")) {
                keyNum++;
            }
            if (st.contains("interface")) {
                keyNum++;
            }
           
            if (st.contains("long")) {
                keyNum++;
            }
            if (st.contains("native")) {
               keyNum++;
            }
            if (st.contains("new")) {
                keyNum++;
            }
            if (st.contains("package")) {
                keyNum++;
            }
            if (st.contains("private")) {
               keyNum++;
            }
            if (st.contains("protected")) {
                keyNum++;
            }
            if (st.contains("public")) {
                keyNum++;
            }
            if (st.contains("return")) {
                keyNum++;
            }
            if (st.contains("short")) {
                keyNum++;
            }
            if (st.contains("static")) {
                keyNum++;
            }
            if (st.contains("strictfp")) {
                keyNum++;
            }
            if (st.contains("super")) {
                keyNum++;
            }
            if (st.contains("switch")) {
                keyNum++;
            }
            if (st.contains("synchronized")) {
                keyNum++;
            }
            if (st.contains("this")) {
               keyNum++;
            }
            if (st.contains("throw")) {
                keyNum++;
            }
            if (st.contains("throws")) {
                keyNum++;
            }
            if (st.contains("transient")) {
                keyNum++;
            }
            if (st.contains("try")) {
                keyNum++;
            }
            if (st.contains("volatile")) {
                keyNum++;
            }
            if (st.contains("true")) {
                keyNum++;
            }
            if (st.contains("while")) {
                keyNum++;
            }
            if (st.contains("void")) {
                 keyNum++;
            }if (st.contains("const")) {
                 keyNum++;
            }if (st.contains("false")) {
                 keyNum++;
            }
            if (st.contains("goto")) {
                 keyNum++;
            }
            if (st.contains("null")) {
                 keyNum++;
            }
            if (st.contains("double")) {
                 keyNum++;
            }
        }
        return keyNum;
    }
    
    public int [] keyJava(String path) throws FileNotFoundException, IOException{
         String st;
        File files = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(files));
        int keyNum=0;
        int keyWord[] = new int[53];
        while ((st = br.readLine()) != null) {
            if (st.contains("class")) {
                keyWord[0]=keyWord[0]+1;
                
            }
            if (st.contains("if")) {
                keyWord[1]=keyWord[1]+1;
            }
            if (st.contains("extends")) {
                keyWord[2]=keyWord[2]+1;
            }
            if (st.contains("abstract")) {
                keyWord[3]=keyWord[3]+1;
            }
            if (st.contains("assert")) {
               keyWord[4]=keyWord[4]+1;;
            }
            if (st.contains("boolean")) {
               keyWord[5]=keyWord[5]+1;
            }
            if (st.contains("break")) {
                keyWord[6]=keyWord[6]+1;
            }
            if (st.contains("byte")) {
                keyWord[7]=keyWord[7]+1;
            }
            if (st.contains("case")) {
                keyWord[8]=keyWord[8]+1;
            }
            if (st.contains("catch")) {
                keyWord[9]=keyWord[9]+1;
            }
            if (st.contains("char")) {
                keyWord[10]=keyWord[10]+1;
            }
            if (st.contains("continue")) {
                keyWord[11]=keyWord[11]+1;
            }
            if (st.contains("default")) {
                keyWord[12]=keyWord[12]+1;
            }
            if (st.contains("do")) {
                keyWord[13]=keyWord[13]+1;
            }
            if (st.contains("else")) {
                keyWord[14]=keyWord[14]+1;
            }
            if (st.contains("enum")) {
                keyWord[15]=keyWord[15]+1;
            }
            if (st.contains("final")) {
                keyWord[16]=keyWord[16]+1;
            }
            if (st.contains("finally")) {
                keyWord[17]=keyWord[17]+1;
            }
            if (st.contains("float")) {
                keyWord[18]=keyWord[18]+1;
            }
            if (st.contains("for")) {
                keyWord[19]=keyWord[19]+1;
            }
            if (st.contains("implements")) {
                keyWord[20]=keyWord[20]+1;
            }
            if (st.contains("import")) {
                keyWord[21]=keyWord[21]+1;
            }
            if (st.contains("instanceof")) {
                keyWord[22]=keyWord[22]+1;
            }
            if (st.contains("int")) {
                keyWord[23]=keyWord[23]+1;
            }
            if (st.contains("interface")) {
                keyWord[24]=keyWord[24]+1;
            }
            if (st.contains("long")) {
                keyWord[25]=keyWord[25]+1;
            }
            if (st.contains("native")) {
                keyWord[26]=keyWord[26]+1;
            }
            if (st.contains("new")) {
                keyWord[27]=keyWord[27]+1;
            }
            if (st.contains("package")) {
                keyWord[28]=keyWord[28]+1;
            }
            if (st.contains("private")) {
                keyWord[29]=keyWord[29]+1;
            }
            if (st.contains("protected")) {
                keyWord[30]=keyWord[30]+1;
            }
            if (st.contains("public")) {
                keyWord[31]=keyWord[31]+1;
            }
            if (st.contains("return")) {
                keyWord[32]=keyWord[32]+1;
            }
            if (st.contains("short")) {
                keyWord[33]=keyWord[33]+1;
            }
            if (st.contains("static")) {
                keyWord[34]=keyWord[34]+1;
            }
            if (st.contains("strictfp")) {
                keyWord[35]=keyWord[35]+1;
            }
            if (st.contains("super")) {
                keyWord[36]=keyWord[36]+1;
            }
            if (st.contains("switch")) {
                keyWord[37]=keyWord[37]+1;
            }
            if (st.contains("synchronized")) {
                keyWord[38]=keyWord[38]+1;
            }
            if (st.contains("this")) {
                keyWord[39]=keyWord[39]+1;
            }
            if (st.contains("throw")) {
                keyWord[40]=keyWord[40]+1;
            }
            if (st.contains("throws")) {
                keyWord[41]=keyWord[41]+1;
            }
            if (st.contains("transient")) {
                keyWord[42]=keyWord[42]+1;
            }
            if (st.contains("try")) {
                keyWord[43]=keyWord[43]+1;
            }
            if (st.contains("volatile")) {
                keyWord[44]=keyWord[44]+1;
            }
            if (st.contains("true")) {
                keyWord[45]=keyWord[45]+1;
            }
            if (st.contains("while")) {
                keyWord[46]=keyWord[46]+1;
            }
            if (st.contains("void")) {
                 keyWord[47]=keyWord[47]+1;
            }if (st.contains("const")) {
                 keyWord[48]=keyWord[48]+1;
            }if (st.contains("false")) {
                 keyWord[49]=keyWord[49]+1;
            }
            if (st.contains("goto")) {
                 keyWord[50]=keyWord[50]+1;
            }
            if (st.contains("null")) {
                 keyWord[51]=keyWord[47]+1;
            }
            if (st.contains("double")) {
                 keyWord[52]=keyWord[47]+1;
            }
        }
        return keyWord;
    }

    public int countTotalValue(int actualLOC, int keyNum) {
        int count;
        count = actualLOC + keyNum;
        return count;
    }
}
