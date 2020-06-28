package domain;

public class LikesInfo {
    private int count;
    private int userLikes;
    private int canLike;
    private int canPublish;

    public int getCount() {
        return count;
    }

    public int getUserLikes() {
        return userLikes;
    }

    public int getCanLike() {
        return canLike;
    }

    public int getCanPublish() {
        return canPublish;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setUserLikes(int userLikes) {
        this.userLikes = userLikes;
    }

    public void setCanLike(int canLike) {
        this.canLike = canLike;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }
}
