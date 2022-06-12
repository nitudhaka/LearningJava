// var Set = new Stack();
// console.log(Set);
 Set = function(){
    var collection = [];
    this.add=function(value){
        if(!this.has(value)){
            collection.push(value);
            return true;
        }
        return false;
    }
    this.remove=function(value){
        var index = collection.indexOf(value);
        if(index>-1){
            collection.splice(index,1);
            return true;
        }
        return false;
    }
    this.values= function(){
        return collection;
    }
    this.has=function(value){
        if(collection.indexOf(value)>-1){
            return true;
        }else{
            return false;
        }
    }
    this.size= function(){
        return collection.length;
    },
    this.union = function(otherset){
        var unionset = new Set();
        var secondSet = otherset.values();
        var firstSet = this.values();
        secondSet.forEach(element => {
            unionset.add(element)
        });
        firstSet.forEach(element => {
            unionset.add(element)
        });
        return unionset;

    },
    this.intersect = function(otherset){
        var intersectSet = new Set();
        var firstSet = this.values();
        var secondSet = otherset.values();
        firstSet.forEach(element=>{
            if(otherset.has(element)){
                intersectSet.add(element);
            }
        });
        return intersectSet;
    }
    this.difference = function(otherset){
        var differenceSet = new Set();
        var secondSet = otherset.values();
        var firstSet = this.values();
        secondSet.forEach(element=>{
            if(!this.has(element)){
                differenceSet.add(element);
            }
        });
        var differenceVal = differenceSet.values();
        firstSet.forEach(element=>{
            if(!otherset.has(element) && differenceVal.indexOf(element)==-1){
                differenceSet.add(element);
            }
        });
        return differenceSet;
    }
    this.subset = function(otherset){
        var subset = new Set();
        var firstSet = this.values();
        var secondSet = otherset.values();
       return firstSet.every(function(value){
            return  otherset.has(value);
        });
    }

}
var set1 = new Set();
set1.add(1);
set1.add(2);
set1.add(1);
set1.add(3);
set1.add(4);
set1.add(4);

console.log(" Set1 ");
console.log(set1.values());
// set1.remove(4);
// console.log(set1.values());

var set2 = new Set();
set2.add(1);
set2.add(2);
set2.add(5);
set2.add(3);
set2.add(8);
set2.add(4);
console.log(" Set2 ");
console.log(set2.values());
// console.log(set2.values());
console.log("Union Set");
var unionset  = set2.union(set1);
console.log(unionset.values());
console.log("Intersect Set");

var intersectSet = set1.intersect(set2);
console.log(intersectSet.values());
console.log(" Difference in set  ");

var differenceSet = set2.difference(set1);
console.log(differenceSet.values());

console.log(" Subset in set  ");
var subset = set2.subset(set1);
console.log(subset);