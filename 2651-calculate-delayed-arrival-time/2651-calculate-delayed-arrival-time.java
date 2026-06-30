class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int newArrival = 0;
        newArrival = arrivalTime + delayedTime;
        if(newArrival >=24){
            newArrival = newArrival % 24;
        }
        return newArrival; 
    }
}