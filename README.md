# Sentiment-Recognition-From-Text
ABSTRACT/ Outline
This Mini project titled “Emotion Recognition from Text” has the objective of recognizing, evaluating and determining the emotion or sentiment of a user in the text entered. This is a NLP (Natural Language Processing) Task as it deals with language and manipulation, evaluation on judging it more precisely it is domain of Opinion Mining or Sentiment Analysis. This project has numerous applications the simplest is to recognize emotion from text while it also finds application in tasks like recommender system, political predictions, Feature extraction where this task of polarity evaluation is a basic task.  


1	the Approach using sentiwordnet

This approach uses sentiwordnet to calculate scores and the flow is as follows:

<img width="660" alt="screen shot 2017-11-05 at 3 25 38 pm" src="https://user-images.githubusercontent.com/13784657/32419324-c23a3cb0-c23d-11e7-99fc-5e8655cde1ab.png">



1.1	Preprocessing Of text

The tasks included in the preprocessing of text are:
⎝	String tokenizing
⎝	POS tagging
⎝	Stemming and Lemmatizing
1.1.1	String Tokenizing 

Separating each word in a document as a single entity that is a “Token”
Java has class java.util.StringTokenizer
For example:
      “Hello my name is Barkha”
         Is returned as 
	hello 
	my
	name
	is
	Barkha

1.1.2	POS (Part Of Speech) Tagging

Part Of Speech Tagging is Tagging a word with it’s part of speech.
Example:
                      For words beautiful and house -
                      beautiful_JJ
	       House_NN
    Noun “_NN”
     Adjective “_JJ”
     Adverb “_RB”
     Verb “_VB”

1.1.3	Stemming and Lemmatizing Text

This tasks is to reduce words to their base forms.
 Like:         am, are, and is to be     
                  Car, cars, car's to car
For Stemming Porter Stemmer Algorithm is used. In where 
Step 1 : Gets rid of plurals and -ed or -ing suffixes  
 Step 2: Turns terminal y to i when there is another vowel in the stem " 
Step 3: Maps double suffixes to single ones: -ization, -ational, etc.” 
 Step 4: Deals with suffixes, -full, -ness etc. 
Step 5: Takes off -ant, -ence, etc. " 
 Step 6: Removes a final -e 
For lemmatizing the Stanford’s NLP lemmatizer is used.


1.2	Extracting scores from sentiwordnet

For extracting score of a word the sentiwordnet file is read then a Hash Map is used to store keys (Words) and values (scores). A hash map is a structure in java which is a combination of set and list where set cannot have duplicate values and list can have duplicate values. A method named “extract” is made that has a constructor which takes the word and its part of speech as parameters returning the score of the word.
Here the score extracted is 
				Positive weight - Negative weight  
1.3	Evaluating Final Sentiment

Text is taken as input.
The text is normalized i.e. preprocessed.
The words in the text are then categorized into groups of 
                         Noun, Adjectives, Adverbs and Verbs
Then scores for each word is extracted.
Positive (>0) and negative (<0) scores are calculated individually.
Then the cumulative positive and negative scores are compared:
Giving
               If (positive>|negative|) Overall Emotion is Positive
               If (|negative|>positive) Overall Emotion is Negative
	        Else Overall Emotion is mixed

1.4	Working of this approach


































1.5	Limitations Of This Approach

υ	Sarcastic Sentences :
                            Example: "What a wonderful car, stopped working in a day? 
υ	Conditional Sentences.
                            Example: “I was happy but now I am sad”
υ	Positive message conveyed with negative orientation and vice-versa.
		Example: “India is fighting with poverty efficiently”
υ	Sentences not having sentiment word and still conveying emotions.
		Example: “This washer uses a lot of water.”
