//if Stack is an object
// var Stack = {
//     count:0,
//     storage:{},
//     pop:function(){

//     },
//     push: function(){

//     },
//     peek:function(){

//     }
// }


//if stack is an function constructor object

var Stack = function(){
    this.count=0;
    this.storage=[],
    this.pop=function(){
        if(this.count==0){
            return undefined;
        }
        this.count--;
        var result = this.storage[this.count];
        // delete this.storage[this.count];
        this.storage.splice(this.count,1);
        return result;
    },
    this.push=function(value){
        this.storage[this.count]= value;
        this.count++;
    },
    this.peek=function(){
        return this.storage[this.count-1];
    }
    this.size = function(){
        return this.count;
    }
}

var stack1 = new Stack();
stack1.push("I need job in good company");
stack1.push("I need  my home");
stack1.push("I need  new car");
console.log(stack1.peek());
console.log(stack1.size());
console.log(stack1.pop());
console.log(stack1.storage)