package com.example.dome;

public class Item {
    private final String title;
    private boolean gotIt;
    private String comment;
    private final int playingTime; // playing time of the main feature

    public Item(String theTitle, int time) {
        title = theTitle;
        gotIt = false;
        playingTime = time;
        comment = "<no comment>";
    }


    /**
     * Enter a comment for this DVD.
     * @param comment The comment to be entered.
     */
    public void setComment(String comment)
    {
        this.comment = comment;
    }

    /**
     * @return The comment for this DVD.
     */
    public String getComment()
    {
        return comment;
    }

    /**
     * Set the flag indicating whether we own this DVD.
     * @param ownIt true if we own the DVD, false otherwise.
     */
    public void setOwn(boolean ownIt)
    {
        gotIt = ownIt;
    }

    /**
     * @return true if we own a copy of this DVD.
     */
    public boolean getOwn()
    {
        return gotIt;
    }

    public String getTitle() {
        return title;
    }

    public int getPlayingTime() {
        return playingTime;
    }

    public void print()
    {
        System.out.print("Item: " + title + " (" + playingTime + " mins)");
        if(gotIt)
        {
            System.out.println("*");
        }
        else
        {
            System.out.println();
        }
        System.out.println("    " + comment);
    }

    /**
     * returns details about this Item.
     */
    public String toString() {
        String s = "";
        s = s + "Item: " + title + " (" + playingTime + " mins)";
        if (gotIt) {
            s = s + "*";
        }
        s = s + "\n    " + comment;
        return s;
    }
}
