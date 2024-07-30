package DSX1;

public class DTO {

   // 1. USER_DT 필드
   private String ID ;
   private int PW ;
    private String NAME ;
   
    // 2. USER_DT 메소드, GETTER, SETTER
    public DTO(String iD, int pW, String nAME) {
       super();
       ID = iD;
       PW = pW;
       NAME = nAME;
    }

   public  String getID() {
      return ID;
   }

   public void setID(String iD) {
      ID = iD;
   }

   public  int getPW() {
      return PW;
   }

   public void setPW(int pW) {
      PW = pW;
   }

   public String getNAME() {
      return NAME;
   }

   public void setNAME(String nAME) {
      NAME = nAME;
   }
   
   
   
   // 1. STUDENT 필드
      private String NICKNAME ;
      private String TYPE ;
      private String ID2 ;
      private int HEALTH ;
      private int FEEL ;
      private int A_LEVEL ;
      private int CLOSE ;
      
   // 2. STUDENT 메소드, GETTER, SETTER

      public DTO(String iD, int pW, String nAME, String nICKNAME, String tYPE, String iD2, int hEALTH, int fEEL,
            int a_LEVEL, int cLOSE) {
         super();
         ID = iD;
         PW = pW;
         NAME = nAME;
         NICKNAME = nICKNAME;
         TYPE = tYPE;
         ID2 = iD2;
         HEALTH = hEALTH;
         FEEL = fEEL;
         A_LEVEL = a_LEVEL;
         CLOSE = cLOSE;
      }

      

      public DTO(String id3, String pw2) {
         // 아이디 비밀먼호 입력 로그인
      }

      public String getNICKNAME() {
         return NICKNAME;
      }

      public void setNICKNAME(String nICKNAME) {
         NICKNAME = nICKNAME;
      }

      public String getTYPE() {
         return TYPE;
      }

      public void setTYPE(String tYPE) {
         TYPE = tYPE;
      }

      public String getID2() {
         return ID2;
      }

      public void setID2(String iD2) {
         ID2 = iD2;
      }

      public int getHEALTH() {
         return HEALTH;
      }

      public void setHEALTH(int hEALTH) {
         HEALTH = hEALTH;
      }

      public int getFEEL() {
         return FEEL;
      }

      public void setFEEL(int fEEL) {
         FEEL = fEEL;
      }

      public int getA_LEVEL() {
         return A_LEVEL;
      }

      public void setA_LEVEL(int a_LEVEL) {
         A_LEVEL = a_LEVEL;
      }

      public int getCLOSE() {
         return CLOSE;
      }

      public void setCLOSE(int cLOSE) {
         CLOSE = cLOSE;
      }

      
   
}