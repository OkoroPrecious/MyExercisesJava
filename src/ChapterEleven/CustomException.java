package ChapterEleven;

public class CustomException {
    public static class CohortElevenException extends RuntimeException {
        public CohortElevenException(){
            super();
        }
        public CohortElevenException(String message){
            super(message);
        }
        public CohortElevenException(Throwable ex){
            super(ex);
        }
        public CohortElevenException(String message, Throwable ex){
            super(message, ex);
        }
    }
}
