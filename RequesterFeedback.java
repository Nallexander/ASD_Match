public class RequesterFeedback{
    private String descrption;
    private boolean abuse;
    private Match match;
}

public RequesterFeedback(String description, boolean abuse, Match match){
    this.description = description;
    this.abuse =abuse;
    this.match=match
}
public void setDescription(String description){
    this.description = description;
}
public String getDescription(){
    return this.description;
}
public void setAbuse( boolean abuse){
    this.abuse = abuse;
}
public boolean getAbuse(){
    return this.abuse;
}
public void setMatch(Match match){
    this.match = match;
}
public Match getMatch(){
    return this.match;
}
