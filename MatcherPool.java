import java.util.*;

public class MatcherPool{

    private static MatcherPool matcherpool = new MatcherPool();

    private LinkedList<Matcher> matchers;

    private MatcherPool(){	
    }

    public static MatcherPool getInstance(){
	return matcherpool;
    }

    public Matcher acquireMatcher(){
	return null;
    }
    public void releaseMatcher(Matcher matcher){
	
    }
}
