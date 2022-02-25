package com.magicalpipelines.language;

import com.magicalpipelines.model.EntitySentiment;
import com.magicalpipelines.serialization.Tweet;
import java.util.List;

public interface LanguageClient {
  Tweet translate(Tweet tweet, String targetLanguage);

  List<EntitySentiment> getEntitySentiment(Tweet tweet);
}
