public class StopWatch{
long startTime,endTime;

//        public StopWatch(long startTime, long endTime) {
//                this.startTime = startTime;
//                this.endTime = endTime;
//        }
        public long Start(){
                return startTime=System.currentTimeMillis();
        }
        public long Stop(){
                return endTime=System.currentTimeMillis();
        }
        public long thoigiandem(){
             long   result = this.endTime-this.startTime;
             return result;
        }
}