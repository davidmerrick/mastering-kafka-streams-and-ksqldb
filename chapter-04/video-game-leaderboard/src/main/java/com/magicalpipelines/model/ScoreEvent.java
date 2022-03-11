package com.magicalpipelines.model;

public class ScoreEvent {
  private Long playerId;
  private Long productId;
  private Double score;

  public Long getPlayerId() {
    return this.playerId;
  }

  public Long getProductId() {
    return this.productId;
  }

  public Double getScore() {
    return this.score;
  }
}
