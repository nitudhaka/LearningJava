var queue = function(){
    var collection = []
    this.print =function(){
        console.log(collection);
    }
    this.enqueue =function(value){
        collection.push(value);
    }
    this.dequeue =function(){
        collection.shift(); 
    }
    this.front =function(){
       return collection[0];
    }
    this.size =function(){
        return collection.length;
    }
    this.isEmpty =function(){
        return (collection.length==0)
    }
}

var queue1 = new queue();
queue1.enqueue(1);
queue1.enqueue("a");
queue1.enqueue(3);
queue1.enqueue(11);
queue1.print();
queue1.dequeue()
queue1.print();
console.log(queue1.front())
console.log(queue1.isEmpty());
console.log(queue1.size()) 

// Priorty Queue



console.log("--------Priorty Queue------");
var priortyQueue = function(){
    var collection = []
    this.print =function(){
        console.log(collection);
    }
    this.enqueue =function(value){
        if(this.isEmpty()){
            collection.push(value);
        }else{
            var added = false;
            for(var i=0;i<collection.length;i++){
                if(value[1]<collection[i][1]){
                    collection.splice(i,0,value);
                    added = true;
                    break;
                }
            }
            if(!added){
                collection.push(value);
            }
        }
    }
    this.dequeue =function(){
        collection.shift(); 
    }
    this.front =function(){
       return collection[0];
    }
    this.size =function(){
        return collection.length;
    }
    this.isEmpty =function(){
        return (collection.length==0)
    } 
}
var queue2 = new priortyQueue();
queue2.enqueue([1,3]);
queue2.enqueue(["a",2]);
queue2.enqueue([3,1]);
queue2.enqueue([11,5]);
queue2.print();
queue2.dequeue()
queue2.print();
console.log(queue2.front())
console.log(queue2.isEmpty());
console.log(queue2.size()) 
