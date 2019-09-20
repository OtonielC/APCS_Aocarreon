public class SentenceRunner
{
    public SentenceRunner(){
        SentenceBuilder sentenceBuilder = new SentenceBuilder();
        String noun = sentenceBuilder.randomNoun();
        String verb = sentenceBuilder.randomVerb();
        String adverb = sentenceBuilder.randomAdverb();
        String adjective = sentenceBuilder.randomAdjective();
        String preposition = sentenceBuilder.randomPreposition();
        String determiner = sentenceBuilder.randomDeterminer();
    }
}
