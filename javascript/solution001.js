function solution(bridge_length, weight, truck_weights) {
    var answer = 0;

    var eTruck = truck_weights.slice();

    var curr = Array.from({length: bridge_length}, () => 0);

    var time = 0;

    while( eTruck.length != 0) {
        
        answer ++;
        curr.splice(0, 1);

        var totalW = curr.reduce((a, c) => a + c);
        if( totalW + eTruck[0] <= weight) {
            
            curr.push(eTruck.splice(0,1)[0]);
        } else {
            curr.push(0);
        }
    }

    var lastW = curr.reduce((a, c) => a + c);
    if( lastW > 0) {
        while( curr.length > 0) {
            curr.splice(0, 1);
            answer ++;
        }
    }

    console.log('answer', answer);

    return answer;
}
