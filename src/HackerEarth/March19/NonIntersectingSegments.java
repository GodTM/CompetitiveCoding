package HackerEarth.March19;
import java.math.BigInteger;
import java.util.*;

public class NonIntersectingSegments {

    public class Tuple<X, Y> {
        public final X x;
        public final Y y;
        public Tuple(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
    class MultiMap<K, V>
    {
        private Map<K, Collection<V>> map = new HashMap<>();

        /**
         * Add the specified value with the specified key in this multimap.
         */
        public void put(K key, V value) {
            if (map.get(key) == null)
                map.put(key, new ArrayList<V>());

            map.get(key).add(value);
        }

        /**
         * Associate the specified key with the given value if not
         * already associated with a value
         */
        public void putIfAbsent(K key, V value) {
            if (map.get(key) == null)
                map.put(key, new ArrayList<>());

            // if value is absent, insert it
            if (!map.get(key).contains(value)) {
                map.get(key).add(value);
            }
        }

        /**
         * Returns the Collection of values to which the specified key is mapped,
         * or null if this multimap contains no mapping for the key.
         */
        public Collection<V> get(Object key) { return map.get(key); }

        /**
         * Returns a Set view of the keys contained in this multimap.
         */
        public Set<K> keySet() { return map.keySet(); }

        /**
         * Returns a Set view of the mappings contained in this multimap.
         */
        public Set<Map.Entry<K, Collection<V>>> entrySet() { return map.entrySet(); }

        /**
         * Returns a Collection view of Collection of the values present in
         * this multimap.
         */
        public Collection<Collection<V>> values() { return map.values(); }

        /**
         * Returns true if this multimap contains a mapping for the specified key.
         */
        public boolean containsKey(Object key) { return map.containsKey(key); }

        /**
         * Removes the mapping for the specified key from this multimap if present
         * and returns the Collection of previous values associated with key, or
         * null if there was no mapping for key.
         */
        public Collection<V> remove(Object key) { return map.remove(key); }

        /**
         * Returns the number of key-value mappings in this multimap.
         */
        public int size() {
            int size = 0;
            for (Collection<V> value: map.values()) {
                size += value.size();
            }
            return size;
        }

        /**
         * Returns true if this multimap contains no key-value mappings.
         */
        public boolean isEmpty() { return map.isEmpty(); }

        /**
         * Removes all of the mappings from this multimap.
         */
        public void clear() { map.clear(); }

        /**
         * Removes the entry for the specified key only if it is currently
         * mapped to the specified value and return true if removed
         */
        public boolean remove(K key, V value){
            if (map.get(key) != null) // key exists
                return map.get(key).remove(value);

            return false;
        }

        /**
         * Replaces the entry for the specified key only if currently
         * mapped to the specified value and return true if replaced
         */
        public boolean replace(K key, V oldValue, V newValue) {
            if (map.get(key) != null) {
                if (map.get(key).remove(oldValue))
                    return map.get(key).add(newValue);
            }
            return false;
        }
    }


    public class CoordPair {
        BigInteger x1 , x2 , y1 , y2;
        public CoordPair(BigInteger a , BigInteger b , BigInteger y1 , BigInteger y2){
            this.x1 = a ;
            this.x2 = b ;
            this.y1 = y1 ;
            this.y2 = y2 ;
        }

        public  BigInteger slope(){
            BigInteger differenceX = x2.subtract(x1) ;
            BigInteger differenceY = y2.subtract(y1) ;
            // if diffX is 0 , then denominator is 0.. the slope is undefined
            if(differenceX.equals(BigInteger.ZERO)){ return null ;}
            else if(differenceY.equals(BigInteger.ZERO) && !differenceX.equals(BigInteger.ZERO)){
                return BigInteger.ZERO ;
            }
            return   differenceY.divide(differenceX) ;
        }

        // returns true if slope is 0 or positive
        // negative otherwise
        public boolean slopeSign(){ return this.slope().compareTo(BigInteger.ZERO) >= 0  ; }

    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;

        HashMap<BigInteger, CoordPair> nullMap = new HashMap<>() ;
        //HashMap<BigInteger , List<CoordPair>> map = new HashMap<>() ;

        // initialising to declare an instance of inner class
        NonIntersectingSegments o1 = new NonIntersectingSegments();
        MultiMap<BigInteger , CoordPair> map = o1.new MultiMap<>() ;

        long numberOfIterations = Long.parseUnsignedLong(input.nextLine().trim()) ;

        if(numberOfIterations>=1 && numberOfIterations<=100000){
            while(numberOfIterations>0){
                String[] coordinates = input.nextLine().trim().split("\\s") ;
                NonIntersectingSegments.CoordPair c =
                        o1.new CoordPair(
                                new BigInteger(coordinates[0]),
                                new BigInteger(coordinates[1]),
                                new BigInteger(coordinates[2]),
                                new BigInteger(coordinates[3])
                        ) ;
                if(c.slope()==null){
                    nullMap.put(null , c) ;
                }
                else {
                    map.put(c.slope(), c); // puts the objects as values for a particular slope
                }
                numberOfIterations-- ;
            }
        }

        // create a multiMap

        int[] allSizes = new int[map.size()+1] ;
        for(int counter = 0 ; counter< allSizes.length ; counter++){

            if(counter== allSizes.length-1){
                allSizes[counter] = nullMap.size() ;
            }
        }

    }
}
