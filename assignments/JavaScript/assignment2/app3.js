function isEven(num){
     if(num%2 === 0){
          return num;
     }
}

var arr = [1,3,5,4,2];

function find(arr,isEven){
   for(var i=0;i<arr.length; i++){
        if(isEven(arr[i])){
             return isEven(arr[i])
        }
   }
}


alert(find(arr, isEven));