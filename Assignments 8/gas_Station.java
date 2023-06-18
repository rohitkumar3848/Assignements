
class gas_Station {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int index=0,sum=0,fuel=0;
        int cSum=0;
        for(int i=0;i<gas.length;i++){
            sum+=gas[i]-cost[i];
            fuel+=gas[i]-cost[i];
            if(fuel<0){
                fuel=0;
                index=i+1;
            }
        }
        if(sum>=0){
            return index%gas.length;
        }
        return -1;
    }
    public static void main(String[] args){
		int gas[] = {1, 2, 3, 4, 5};
		int cost[] = {3, 4, 5, 1, 2};
		System.out.println("The starting station is : " + canCompleteCircuit(gas , cost));
	}
}
