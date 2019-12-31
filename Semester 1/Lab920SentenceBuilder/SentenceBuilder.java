
/**
 * Big Chonk
 *
 * @author (oats)
 * @version (920)
 */
public class SentenceBuilder
{
    
    public String[] nouns = {"puppy", "pizza", "snake", "doorbell", "girl", "building"};
    public String[] verbs = {"jumps", "runs", "flies", "eats", "makes", "wants","sings","skips"};
    public String[] adverbs = {"smol", "wearily", "nicely", "gratefully", "slowly"};
    public String[] adjectives = {"fabulous", "easy", "chilly", "able", "babyish", "gaseous"};
    public String[] determiners = {"its", "ours", "Dom's", "Dad's", "dog's", "Hal's","Ed's"};
    public String[] prepositions = {"outside of", "around", "above", "beside", "to the left of", "to the right of"};
    public String randomNoun(){
        int x = (int)(Math.random()*nouns.length);
        return nouns[x];
    }
    public String randomVerb(){
        int x = (int)(Math.random()*verbs.length);
        return verbs[x];
    }
    public String randomAdverb(){
        int x = (int)(Math.random()*adverbs.length);
        return adverbs[x];
    }
    public String randomAdjective(){
        int x = (int)(Math.random()*adjectives.length);
        return adjectives[x];
    }
    public String randomDeterminer(){
        int x = (int)(Math.random()*determiners.length);
        return determiners[x];
    }public String randomPreposition(){
        int x = (int)(Math.random()*prepositions.length);
        return prepositions[x];
    }
}
