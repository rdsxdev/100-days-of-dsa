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
> target - current = partner (have I seen the partner in nums? )
we need to return index here. 

4. Which data structure stores that information?
>HashMaps stores the information becuase of the hash function. 

 /*syntax: HashMap<Integer, Integer> map = new HashMap<>();
        Insert: map.put(1,0)
        Update: map.get(1)
        Lookup: map.containsKey(1)*/

5. Complexity?
>n × O(1) = O(n)

6. Notes: 
>Hashmaps -> Stores things as KEY -> VALUE.
 problem = NUMBER -> INDEX.

## problem 2 [CONTAINS DUPLICATE]
./
1. What is the brute force?
>For every number in nums compare it with every other number in the array to see if any two integers are equal. (combination one of them is true)

2. Why is it slow?
> Comparing every integers with many other integers --> n x n = O(n²)

3. What information do I need to remember?
> Need to remember what number I have seen. If it's NEW we put it in memory, if it's ALREADY in memory --> DUPLICATE --> return TRUE.

4. Which data structure  stores that information?
> HashSet --> it is a collection that stores *unique VALUES*.
        /*syntax: HashSet<Integer> seen = new HashSet<>();
                add(5): Put (5) into the set.
                contains(5): If (5) is present in the set.
                remove():Removes (5) from the set
                size():Tells how many unique elements are present */

5. Complexity?
>n × O(1) = O(n)

## problem 3 [THREE SUM]
./
1. What is the brute force?
> Try every possible triplet and check whether its sum is 0.

2. Why is it slow?
>
 
3. What information do I need to remember?
>
4. Which data structure  stores that information?
>
5. Complexity?