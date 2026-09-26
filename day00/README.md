## problem 1 [TWO SUM]
./ 
1. What is the brute force?
> Adding 'nums' consecutively to find out the 'target' (combinations).   
               ( target - num1 = num2 )
        - if num2 present in the array it gets included in the set. 
        - time complexity == O(n²)

2. Why is it slow?
> It is slow because it goes through every element in the array linearly (one-by-one) which in return increases the time complexity.

3. What information do I need to remember?
> target - current = partner
we need to return index here.

4. Which data structure stores that information?
HashMaps stores the information becuase of the hash function. 

/*syntax: HashMap<Integer, Integer> map = new HashMap<>();
Insert: map.put(1,0)
Update: map.get(1)
Lookup: map.containsKey(1)*/

5. Complexity?
n × O(1) = O(n)

6. Notes: 
Hashmaps -> 
Stores things as KEY -> VALUE.
problem = NUMBER -> INDEX.

## problem 2 [CONTAINS DUPLICATE]
./
1. What is the brute force?

2. Why is it slow?
 
3. What information do I need to remember?

4. Which data structure  stores that information?

5. Complexity?

## problem 3 [THREE SUM]
./
1. What is the brute force?

2. Why is it slow?
 
3. What information do I need to remember?

4. Which data structure  stores that information?

5. Complexity?