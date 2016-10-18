
package com.example.pepe.sopitas.Models2;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Datum {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("opta_id")
    @Expose
    private String optaId;
    @SerializedName("season")
    @Expose
    private String season;
    @SerializedName("sport")
    @Expose
    private String sport;
    @SerializedName("tournament")
    @Expose
    private String tournament;
    @SerializedName("round_number")
    @Expose
    private String roundNumber;
    @SerializedName("round_type")
    @Expose
    private String roundType;
    @SerializedName("group_name")
    @Expose
    private String groupName;
    @SerializedName("period")
    @Expose
    private String period;
    @SerializedName("match_status")
    @Expose
    private String matchStatus;
    @SerializedName("is_a_game")
    @Expose
    private String isAGame;
    @SerializedName("home_team")
    @Expose
    private String homeTeam;
    @SerializedName("away_team")
    @Expose
    private String awayTeam;
    @SerializedName("commentator")
    @Expose
    private String commentator;
    @SerializedName("kick_off_gmt")
    @Expose
    private String kickOffGmt;
    @SerializedName("home_score")
    @Expose
    private String homeScore;
    @SerializedName("away_score")
    @Expose
    private String awayScore;
    @SerializedName("media_player_start")
    @Expose
    private String mediaPlayerStart;
    @SerializedName("media_player_end")
    @Expose
    private String mediaPlayerEnd;
    @SerializedName("live_stream_channel")
    @Expose
    private String liveStreamChannel;
    @SerializedName("ondemand_stream_en")
    @Expose
    private String ondemandStreamEn;
    @SerializedName("ondemand_stream_es")
    @Expose
    private String ondemandStreamEs;
    @SerializedName("ondemand_stream_zh")
    @Expose
    private String ondemandStreamZh;
    @SerializedName("highlights_stream_en")
    @Expose
    private String highlightsStreamEn;
    @SerializedName("highlights_stream_es")
    @Expose
    private String highlightsStreamEs;
    @SerializedName("highlights_stream_zh")
    @Expose
    private String highlightsStreamZh;
    @SerializedName("allowed_languages")
    @Expose
    private AllowedLanguages allowedLanguages;
    @SerializedName("allowed_countries")
    @Expose
    private AllowedCountries allowedCountries;
    @SerializedName("tournament_countries")
    @Expose
    private TournamentCountries tournamentCountries;
    @SerializedName("extras")
    @Expose
    private Extras extras;
    @SerializedName("alerts")
    @Expose
    private String alerts;
    @SerializedName("sHomeTeam")
    @Expose
    private String sHomeTeam;
    @SerializedName("sAwayTeam")
    @Expose
    private String sAwayTeam;
    @SerializedName("sSport")
    @Expose
    private String sSport;
    @SerializedName("home_team_opta_id")
    @Expose
    private String homeTeamOptaId;
    @SerializedName("away_team_opta_id")
    @Expose
    private String awayTeamOptaId;
    @SerializedName("home_team_slug")
    @Expose
    private String homeTeamSlug;
    @SerializedName("away_team_slug")
    @Expose
    private String awayTeamSlug;
    @SerializedName("home_other_names")
    @Expose
    private String homeOtherNames;
    @SerializedName("away_other_names")
    @Expose
    private String awayOtherNames;
    @SerializedName("aOtherNamesHome")
    @Expose
    private AOtherNamesHome aOtherNamesHome;
    @SerializedName("aOtherNamesAway")
    @Expose
    private AOtherNamesAway aOtherNamesAway;
    @SerializedName("bOnDemanden")
    @Expose
    private Object bOnDemanden;
    @SerializedName("bOnDemandes")
    @Expose
    private Object bOnDemandes;
    @SerializedName("bOnDemandzh")
    @Expose
    private Object bOnDemandzh;
    @SerializedName("aReports")
    @Expose
    private List<Object> aReports = new ArrayList<Object>();
    @SerializedName("match_day")
    @Expose
    private String matchDay;
    @SerializedName("detail_id")
    @Expose
    private String detailId;
    @SerializedName("home_prematch_aggregate_score")
    @Expose
    private String homePrematchAggregateScore;
    @SerializedName("home_aggregate_score")
    @Expose
    private String homeAggregateScore;
    @SerializedName("home_halftime_score")
    @Expose
    private String homeHalftimeScore;
    @SerializedName("home_ninety_score")
    @Expose
    private String homeNinetyScore;
    @SerializedName("home_score_after_et")
    @Expose
    private String homeScoreAfterEt;
    @SerializedName("home_penalty_shoot_out")
    @Expose
    private String homePenaltyShootOut;
    @SerializedName("home_away_goal_winner")
    @Expose
    private String homeAwayGoalWinner;
    @SerializedName("away_prematch_aggregate_score")
    @Expose
    private String awayPrematchAggregateScore;
    @SerializedName("away_aggregate_score")
    @Expose
    private String awayAggregateScore;
    @SerializedName("away_halftime_score")
    @Expose
    private String awayHalftimeScore;
    @SerializedName("away_ninety_score")
    @Expose
    private String awayNinetyScore;
    @SerializedName("away_score_after_et")
    @Expose
    private String awayScoreAfterEt;
    @SerializedName("away_penalty_shoot_out")
    @Expose
    private String awayPenaltyShootOut;
    @SerializedName("away_away_goal_winner")
    @Expose
    private String awayAwayGoalWinner;
    @SerializedName("match_type")
    @Expose
    private String matchType;
    @SerializedName("leg")
    @Expose
    private String leg;
    @SerializedName("first_leg_id")
    @Expose
    private Object firstLegId;
    @SerializedName("first_leg_winner")
    @Expose
    private String firstLegWinner;
    @SerializedName("leg_winner")
    @Expose
    private String legWinner;
    @SerializedName("match_winner")
    @Expose
    private String matchWinner;
    @SerializedName("next_match")
    @Expose
    private String nextMatch;
    @SerializedName("next_match_loser")
    @Expose
    private String nextMatchLoser;
    @SerializedName("will_broadcast")
    @Expose
    private String willBroadcast;
    @SerializedName("tournament_title")
    @Expose
    private String tournamentTitle;
    @SerializedName("tournament_other_names")
    @Expose
    private TournamentOtherNames tournamentOtherNames;
    @SerializedName("tournament_slug")
    @Expose
    private String tournamentSlug;
    @SerializedName("sFullHomeTeam")
    @Expose
    private String sFullHomeTeam;
    @SerializedName("home_team_abbr")
    @Expose
    private String homeTeamAbbr;
    @SerializedName("sFullAwayTeam")
    @Expose
    private String sFullAwayTeam;
    @SerializedName("away_team_abbr")
    @Expose
    private String awayTeamAbbr;
    @SerializedName("fixture_date")
    @Expose
    private String fixtureDate;

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The optaId
     */
    public String getOptaId() {
        return optaId;
    }

    /**
     * 
     * @param optaId
     *     The opta_id
     */
    public void setOptaId(String optaId) {
        this.optaId = optaId;
    }

    /**
     * 
     * @return
     *     The season
     */
    public String getSeason() {
        return season;
    }

    /**
     * 
     * @param season
     *     The season
     */
    public void setSeason(String season) {
        this.season = season;
    }

    /**
     * 
     * @return
     *     The sport
     */
    public String getSport() {
        return sport;
    }

    /**
     * 
     * @param sport
     *     The sport
     */
    public void setSport(String sport) {
        this.sport = sport;
    }

    /**
     * 
     * @return
     *     The tournament
     */
    public String getTournament() {
        return tournament;
    }

    /**
     * 
     * @param tournament
     *     The tournament
     */
    public void setTournament(String tournament) {
        this.tournament = tournament;
    }

    /**
     * 
     * @return
     *     The roundNumber
     */
    public String getRoundNumber() {
        return roundNumber;
    }

    /**
     * 
     * @param roundNumber
     *     The round_number
     */
    public void setRoundNumber(String roundNumber) {
        this.roundNumber = roundNumber;
    }

    /**
     * 
     * @return
     *     The roundType
     */
    public String getRoundType() {
        return roundType;
    }

    /**
     * 
     * @param roundType
     *     The round_type
     */
    public void setRoundType(String roundType) {
        this.roundType = roundType;
    }

    /**
     * 
     * @return
     *     The groupName
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 
     * @param groupName
     *     The group_name
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * 
     * @return
     *     The period
     */
    public String getPeriod() {
        return period;
    }

    /**
     * 
     * @param period
     *     The period
     */
    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * 
     * @return
     *     The matchStatus
     */
    public String getMatchStatus() {
        return matchStatus;
    }

    /**
     * 
     * @param matchStatus
     *     The match_status
     */
    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
    }

    /**
     * 
     * @return
     *     The isAGame
     */
    public String getIsAGame() {
        return isAGame;
    }

    /**
     * 
     * @param isAGame
     *     The is_a_game
     */
    public void setIsAGame(String isAGame) {
        this.isAGame = isAGame;
    }

    /**
     * 
     * @return
     *     The homeTeam
     */
    public String getHomeTeam() {
        return homeTeam;
    }

    /**
     * 
     * @param homeTeam
     *     The home_team
     */
    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    /**
     * 
     * @return
     *     The awayTeam
     */
    public String getAwayTeam() {
        return awayTeam;
    }

    /**
     * 
     * @param awayTeam
     *     The away_team
     */
    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    /**
     * 
     * @return
     *     The commentator
     */
    public String getCommentator() {
        return commentator;
    }

    /**
     * 
     * @param commentator
     *     The commentator
     */
    public void setCommentator(String commentator) {
        this.commentator = commentator;
    }

    /**
     * 
     * @return
     *     The kickOffGmt
     */
    public String getKickOffGmt() {
        return kickOffGmt;
    }

    /**
     * 
     * @param kickOffGmt
     *     The kick_off_gmt
     */
    public void setKickOffGmt(String kickOffGmt) {
        this.kickOffGmt = kickOffGmt;
    }

    /**
     * 
     * @return
     *     The homeScore
     */
    public String getHomeScore() {
        return homeScore;
    }

    /**
     * 
     * @param homeScore
     *     The home_score
     */
    public void setHomeScore(String homeScore) {
        this.homeScore = homeScore;
    }

    /**
     * 
     * @return
     *     The awayScore
     */
    public String getAwayScore() {
        return awayScore;
    }

    /**
     * 
     * @param awayScore
     *     The away_score
     */
    public void setAwayScore(String awayScore) {
        this.awayScore = awayScore;
    }

    /**
     * 
     * @return
     *     The mediaPlayerStart
     */
    public String getMediaPlayerStart() {
        return mediaPlayerStart;
    }

    /**
     * 
     * @param mediaPlayerStart
     *     The media_player_start
     */
    public void setMediaPlayerStart(String mediaPlayerStart) {
        this.mediaPlayerStart = mediaPlayerStart;
    }

    /**
     * 
     * @return
     *     The mediaPlayerEnd
     */
    public String getMediaPlayerEnd() {
        return mediaPlayerEnd;
    }

    /**
     * 
     * @param mediaPlayerEnd
     *     The media_player_end
     */
    public void setMediaPlayerEnd(String mediaPlayerEnd) {
        this.mediaPlayerEnd = mediaPlayerEnd;
    }

    /**
     * 
     * @return
     *     The liveStreamChannel
     */
    public String getLiveStreamChannel() {
        return liveStreamChannel;
    }

    /**
     * 
     * @param liveStreamChannel
     *     The live_stream_channel
     */
    public void setLiveStreamChannel(String liveStreamChannel) {
        this.liveStreamChannel = liveStreamChannel;
    }

    /**
     * 
     * @return
     *     The ondemandStreamEn
     */
    public String getOndemandStreamEn() {
        return ondemandStreamEn;
    }

    /**
     * 
     * @param ondemandStreamEn
     *     The ondemand_stream_en
     */
    public void setOndemandStreamEn(String ondemandStreamEn) {
        this.ondemandStreamEn = ondemandStreamEn;
    }

    /**
     * 
     * @return
     *     The ondemandStreamEs
     */
    public String getOndemandStreamEs() {
        return ondemandStreamEs;
    }

    /**
     * 
     * @param ondemandStreamEs
     *     The ondemand_stream_es
     */
    public void setOndemandStreamEs(String ondemandStreamEs) {
        this.ondemandStreamEs = ondemandStreamEs;
    }

    /**
     * 
     * @return
     *     The ondemandStreamZh
     */
    public String getOndemandStreamZh() {
        return ondemandStreamZh;
    }

    /**
     * 
     * @param ondemandStreamZh
     *     The ondemand_stream_zh
     */
    public void setOndemandStreamZh(String ondemandStreamZh) {
        this.ondemandStreamZh = ondemandStreamZh;
    }

    /**
     * 
     * @return
     *     The highlightsStreamEn
     */
    public String getHighlightsStreamEn() {
        return highlightsStreamEn;
    }

    /**
     * 
     * @param highlightsStreamEn
     *     The highlights_stream_en
     */
    public void setHighlightsStreamEn(String highlightsStreamEn) {
        this.highlightsStreamEn = highlightsStreamEn;
    }

    /**
     * 
     * @return
     *     The highlightsStreamEs
     */
    public String getHighlightsStreamEs() {
        return highlightsStreamEs;
    }

    /**
     * 
     * @param highlightsStreamEs
     *     The highlights_stream_es
     */
    public void setHighlightsStreamEs(String highlightsStreamEs) {
        this.highlightsStreamEs = highlightsStreamEs;
    }

    /**
     * 
     * @return
     *     The highlightsStreamZh
     */
    public String getHighlightsStreamZh() {
        return highlightsStreamZh;
    }

    /**
     * 
     * @param highlightsStreamZh
     *     The highlights_stream_zh
     */
    public void setHighlightsStreamZh(String highlightsStreamZh) {
        this.highlightsStreamZh = highlightsStreamZh;
    }

    /**
     * 
     * @return
     *     The allowedLanguages
     */
    public AllowedLanguages getAllowedLanguages() {
        return allowedLanguages;
    }

    /**
     * 
     * @param allowedLanguages
     *     The allowed_languages
     */
    public void setAllowedLanguages(AllowedLanguages allowedLanguages) {
        this.allowedLanguages = allowedLanguages;
    }

    /**
     * 
     * @return
     *     The allowedCountries
     */
    public AllowedCountries getAllowedCountries() {
        return allowedCountries;
    }

    /**
     * 
     * @param allowedCountries
     *     The allowed_countries
     */
    public void setAllowedCountries(AllowedCountries allowedCountries) {
        this.allowedCountries = allowedCountries;
    }

    /**
     * 
     * @return
     *     The tournamentCountries
     */
    public TournamentCountries getTournamentCountries() {
        return tournamentCountries;
    }

    /**
     * 
     * @param tournamentCountries
     *     The tournament_countries
     */
    public void setTournamentCountries(TournamentCountries tournamentCountries) {
        this.tournamentCountries = tournamentCountries;
    }

    /**
     * 
     * @return
     *     The extras
     */
    public Extras getExtras() {
        return extras;
    }

    /**
     * 
     * @param extras
     *     The extras
     */
    public void setExtras(Extras extras) {
        this.extras = extras;
    }

    /**
     * 
     * @return
     *     The alerts
     */
    public String getAlerts() {
        return alerts;
    }

    /**
     * 
     * @param alerts
     *     The alerts
     */
    public void setAlerts(String alerts) {
        this.alerts = alerts;
    }

    /**
     * 
     * @return
     *     The sHomeTeam
     */
    public String getSHomeTeam() {
        return sHomeTeam;
    }

    /**
     * 
     * @param sHomeTeam
     *     The sHomeTeam
     */
    public void setSHomeTeam(String sHomeTeam) {
        this.sHomeTeam = sHomeTeam;
    }

    /**
     * 
     * @return
     *     The sAwayTeam
     */
    public String getSAwayTeam() {
        return sAwayTeam;
    }

    /**
     * 
     * @param sAwayTeam
     *     The sAwayTeam
     */
    public void setSAwayTeam(String sAwayTeam) {
        this.sAwayTeam = sAwayTeam;
    }

    /**
     * 
     * @return
     *     The sSport
     */
    public String getSSport() {
        return sSport;
    }

    /**
     * 
     * @param sSport
     *     The sSport
     */
    public void setSSport(String sSport) {
        this.sSport = sSport;
    }

    /**
     * 
     * @return
     *     The homeTeamOptaId
     */
    public String getHomeTeamOptaId() {
        return homeTeamOptaId;
    }

    /**
     * 
     * @param homeTeamOptaId
     *     The home_team_opta_id
     */
    public void setHomeTeamOptaId(String homeTeamOptaId) {
        this.homeTeamOptaId = homeTeamOptaId;
    }

    /**
     * 
     * @return
     *     The awayTeamOptaId
     */
    public String getAwayTeamOptaId() {
        return awayTeamOptaId;
    }

    /**
     * 
     * @param awayTeamOptaId
     *     The away_team_opta_id
     */
    public void setAwayTeamOptaId(String awayTeamOptaId) {
        this.awayTeamOptaId = awayTeamOptaId;
    }

    /**
     * 
     * @return
     *     The homeTeamSlug
     */
    public String getHomeTeamSlug() {
        return homeTeamSlug;
    }

    /**
     * 
     * @param homeTeamSlug
     *     The home_team_slug
     */
    public void setHomeTeamSlug(String homeTeamSlug) {
        this.homeTeamSlug = homeTeamSlug;
    }

    /**
     * 
     * @return
     *     The awayTeamSlug
     */
    public String getAwayTeamSlug() {
        return awayTeamSlug;
    }

    /**
     * 
     * @param awayTeamSlug
     *     The away_team_slug
     */
    public void setAwayTeamSlug(String awayTeamSlug) {
        this.awayTeamSlug = awayTeamSlug;
    }

    /**
     * 
     * @return
     *     The homeOtherNames
     */
    public String getHomeOtherNames() {
        return homeOtherNames;
    }

    /**
     * 
     * @param homeOtherNames
     *     The home_other_names
     */
    public void setHomeOtherNames(String homeOtherNames) {
        this.homeOtherNames = homeOtherNames;
    }

    /**
     * 
     * @return
     *     The awayOtherNames
     */
    public String getAwayOtherNames() {
        return awayOtherNames;
    }

    /**
     * 
     * @param awayOtherNames
     *     The away_other_names
     */
    public void setAwayOtherNames(String awayOtherNames) {
        this.awayOtherNames = awayOtherNames;
    }

    /**
     * 
     * @return
     *     The aOtherNamesHome
     */
    public AOtherNamesHome getAOtherNamesHome() {
        return aOtherNamesHome;
    }

    /**
     * 
     * @param aOtherNamesHome
     *     The aOtherNamesHome
     */
    public void setAOtherNamesHome(AOtherNamesHome aOtherNamesHome) {
        this.aOtherNamesHome = aOtherNamesHome;
    }

    /**
     * 
     * @return
     *     The aOtherNamesAway
     */
    public AOtherNamesAway getAOtherNamesAway() {
        return aOtherNamesAway;
    }

    /**
     * 
     * @param aOtherNamesAway
     *     The aOtherNamesAway
     */
    public void setAOtherNamesAway(AOtherNamesAway aOtherNamesAway) {
        this.aOtherNamesAway = aOtherNamesAway;
    }

    /**
     * 
     * @return
     *     The bOnDemanden
     */
    public Object getBOnDemanden() {
        return bOnDemanden;
    }

    /**
     * 
     * @param bOnDemanden
     *     The bOnDemanden
     */
    public void setBOnDemanden(Object bOnDemanden) {
        this.bOnDemanden = bOnDemanden;
    }

    /**
     * 
     * @return
     *     The bOnDemandes
     */
    public Object getBOnDemandes() {
        return bOnDemandes;
    }

    /**
     * 
     * @param bOnDemandes
     *     The bOnDemandes
     */
    public void setBOnDemandes(Object bOnDemandes) {
        this.bOnDemandes = bOnDemandes;
    }

    /**
     * 
     * @return
     *     The bOnDemandzh
     */
    public Object getBOnDemandzh() {
        return bOnDemandzh;
    }

    /**
     * 
     * @param bOnDemandzh
     *     The bOnDemandzh
     */
    public void setBOnDemandzh(Object bOnDemandzh) {
        this.bOnDemandzh = bOnDemandzh;
    }

    /**
     * 
     * @return
     *     The aReports
     */
    public List<Object> getAReports() {
        return aReports;
    }

    /**
     * 
     * @param aReports
     *     The aReports
     */
    public void setAReports(List<Object> aReports) {
        this.aReports = aReports;
    }

    /**
     * 
     * @return
     *     The matchDay
     */
    public String getMatchDay() {
        return matchDay;
    }

    /**
     * 
     * @param matchDay
     *     The match_day
     */
    public void setMatchDay(String matchDay) {
        this.matchDay = matchDay;
    }

    /**
     * 
     * @return
     *     The detailId
     */
    public String getDetailId() {
        return detailId;
    }

    /**
     * 
     * @param detailId
     *     The detail_id
     */
    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    /**
     * 
     * @return
     *     The homePrematchAggregateScore
     */
    public String getHomePrematchAggregateScore() {
        return homePrematchAggregateScore;
    }

    /**
     * 
     * @param homePrematchAggregateScore
     *     The home_prematch_aggregate_score
     */
    public void setHomePrematchAggregateScore(String homePrematchAggregateScore) {
        this.homePrematchAggregateScore = homePrematchAggregateScore;
    }

    /**
     * 
     * @return
     *     The homeAggregateScore
     */
    public String getHomeAggregateScore() {
        return homeAggregateScore;
    }

    /**
     * 
     * @param homeAggregateScore
     *     The home_aggregate_score
     */
    public void setHomeAggregateScore(String homeAggregateScore) {
        this.homeAggregateScore = homeAggregateScore;
    }

    /**
     * 
     * @return
     *     The homeHalftimeScore
     */
    public String getHomeHalftimeScore() {
        return homeHalftimeScore;
    }

    /**
     * 
     * @param homeHalftimeScore
     *     The home_halftime_score
     */
    public void setHomeHalftimeScore(String homeHalftimeScore) {
        this.homeHalftimeScore = homeHalftimeScore;
    }

    /**
     * 
     * @return
     *     The homeNinetyScore
     */
    public String getHomeNinetyScore() {
        return homeNinetyScore;
    }

    /**
     * 
     * @param homeNinetyScore
     *     The home_ninety_score
     */
    public void setHomeNinetyScore(String homeNinetyScore) {
        this.homeNinetyScore = homeNinetyScore;
    }

    /**
     * 
     * @return
     *     The homeScoreAfterEt
     */
    public String getHomeScoreAfterEt() {
        return homeScoreAfterEt;
    }

    /**
     * 
     * @param homeScoreAfterEt
     *     The home_score_after_et
     */
    public void setHomeScoreAfterEt(String homeScoreAfterEt) {
        this.homeScoreAfterEt = homeScoreAfterEt;
    }

    /**
     * 
     * @return
     *     The homePenaltyShootOut
     */
    public String getHomePenaltyShootOut() {
        return homePenaltyShootOut;
    }

    /**
     * 
     * @param homePenaltyShootOut
     *     The home_penalty_shoot_out
     */
    public void setHomePenaltyShootOut(String homePenaltyShootOut) {
        this.homePenaltyShootOut = homePenaltyShootOut;
    }

    /**
     * 
     * @return
     *     The homeAwayGoalWinner
     */
    public String getHomeAwayGoalWinner() {
        return homeAwayGoalWinner;
    }

    /**
     * 
     * @param homeAwayGoalWinner
     *     The home_away_goal_winner
     */
    public void setHomeAwayGoalWinner(String homeAwayGoalWinner) {
        this.homeAwayGoalWinner = homeAwayGoalWinner;
    }

    /**
     * 
     * @return
     *     The awayPrematchAggregateScore
     */
    public String getAwayPrematchAggregateScore() {
        return awayPrematchAggregateScore;
    }

    /**
     * 
     * @param awayPrematchAggregateScore
     *     The away_prematch_aggregate_score
     */
    public void setAwayPrematchAggregateScore(String awayPrematchAggregateScore) {
        this.awayPrematchAggregateScore = awayPrematchAggregateScore;
    }

    /**
     * 
     * @return
     *     The awayAggregateScore
     */
    public String getAwayAggregateScore() {
        return awayAggregateScore;
    }

    /**
     * 
     * @param awayAggregateScore
     *     The away_aggregate_score
     */
    public void setAwayAggregateScore(String awayAggregateScore) {
        this.awayAggregateScore = awayAggregateScore;
    }

    /**
     * 
     * @return
     *     The awayHalftimeScore
     */
    public String getAwayHalftimeScore() {
        return awayHalftimeScore;
    }

    /**
     * 
     * @param awayHalftimeScore
     *     The away_halftime_score
     */
    public void setAwayHalftimeScore(String awayHalftimeScore) {
        this.awayHalftimeScore = awayHalftimeScore;
    }

    /**
     * 
     * @return
     *     The awayNinetyScore
     */
    public String getAwayNinetyScore() {
        return awayNinetyScore;
    }

    /**
     * 
     * @param awayNinetyScore
     *     The away_ninety_score
     */
    public void setAwayNinetyScore(String awayNinetyScore) {
        this.awayNinetyScore = awayNinetyScore;
    }

    /**
     * 
     * @return
     *     The awayScoreAfterEt
     */
    public String getAwayScoreAfterEt() {
        return awayScoreAfterEt;
    }

    /**
     * 
     * @param awayScoreAfterEt
     *     The away_score_after_et
     */
    public void setAwayScoreAfterEt(String awayScoreAfterEt) {
        this.awayScoreAfterEt = awayScoreAfterEt;
    }

    /**
     * 
     * @return
     *     The awayPenaltyShootOut
     */
    public String getAwayPenaltyShootOut() {
        return awayPenaltyShootOut;
    }

    /**
     * 
     * @param awayPenaltyShootOut
     *     The away_penalty_shoot_out
     */
    public void setAwayPenaltyShootOut(String awayPenaltyShootOut) {
        this.awayPenaltyShootOut = awayPenaltyShootOut;
    }

    /**
     * 
     * @return
     *     The awayAwayGoalWinner
     */
    public String getAwayAwayGoalWinner() {
        return awayAwayGoalWinner;
    }

    /**
     * 
     * @param awayAwayGoalWinner
     *     The away_away_goal_winner
     */
    public void setAwayAwayGoalWinner(String awayAwayGoalWinner) {
        this.awayAwayGoalWinner = awayAwayGoalWinner;
    }

    /**
     * 
     * @return
     *     The matchType
     */
    public String getMatchType() {
        return matchType;
    }

    /**
     * 
     * @param matchType
     *     The match_type
     */
    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    /**
     * 
     * @return
     *     The leg
     */
    public String getLeg() {
        return leg;
    }

    /**
     * 
     * @param leg
     *     The leg
     */
    public void setLeg(String leg) {
        this.leg = leg;
    }

    /**
     * 
     * @return
     *     The firstLegId
     */
    public Object getFirstLegId() {
        return firstLegId;
    }

    /**
     * 
     * @param firstLegId
     *     The first_leg_id
     */
    public void setFirstLegId(Object firstLegId) {
        this.firstLegId = firstLegId;
    }

    /**
     * 
     * @return
     *     The firstLegWinner
     */
    public String getFirstLegWinner() {
        return firstLegWinner;
    }

    /**
     * 
     * @param firstLegWinner
     *     The first_leg_winner
     */
    public void setFirstLegWinner(String firstLegWinner) {
        this.firstLegWinner = firstLegWinner;
    }

    /**
     * 
     * @return
     *     The legWinner
     */
    public String getLegWinner() {
        return legWinner;
    }

    /**
     * 
     * @param legWinner
     *     The leg_winner
     */
    public void setLegWinner(String legWinner) {
        this.legWinner = legWinner;
    }

    /**
     * 
     * @return
     *     The matchWinner
     */
    public String getMatchWinner() {
        return matchWinner;
    }

    /**
     * 
     * @param matchWinner
     *     The match_winner
     */
    public void setMatchWinner(String matchWinner) {
        this.matchWinner = matchWinner;
    }

    /**
     * 
     * @return
     *     The nextMatch
     */
    public String getNextMatch() {
        return nextMatch;
    }

    /**
     * 
     * @param nextMatch
     *     The next_match
     */
    public void setNextMatch(String nextMatch) {
        this.nextMatch = nextMatch;
    }

    /**
     * 
     * @return
     *     The nextMatchLoser
     */
    public String getNextMatchLoser() {
        return nextMatchLoser;
    }

    /**
     * 
     * @param nextMatchLoser
     *     The next_match_loser
     */
    public void setNextMatchLoser(String nextMatchLoser) {
        this.nextMatchLoser = nextMatchLoser;
    }

    /**
     * 
     * @return
     *     The willBroadcast
     */
    public String getWillBroadcast() {
        return willBroadcast;
    }

    /**
     * 
     * @param willBroadcast
     *     The will_broadcast
     */
    public void setWillBroadcast(String willBroadcast) {
        this.willBroadcast = willBroadcast;
    }

    /**
     * 
     * @return
     *     The tournamentTitle
     */
    public String getTournamentTitle() {
        return tournamentTitle;
    }

    /**
     * 
     * @param tournamentTitle
     *     The tournament_title
     */
    public void setTournamentTitle(String tournamentTitle) {
        this.tournamentTitle = tournamentTitle;
    }

    /**
     * 
     * @return
     *     The tournamentOtherNames
     */
    public TournamentOtherNames getTournamentOtherNames() {
        return tournamentOtherNames;
    }

    /**
     * 
     * @param tournamentOtherNames
     *     The tournament_other_names
     */
    public void setTournamentOtherNames(TournamentOtherNames tournamentOtherNames) {
        this.tournamentOtherNames = tournamentOtherNames;
    }

    /**
     * 
     * @return
     *     The tournamentSlug
     */
    public String getTournamentSlug() {
        return tournamentSlug;
    }

    /**
     * 
     * @param tournamentSlug
     *     The tournament_slug
     */
    public void setTournamentSlug(String tournamentSlug) {
        this.tournamentSlug = tournamentSlug;
    }

    /**
     * 
     * @return
     *     The sFullHomeTeam
     */
    public String getSFullHomeTeam() {
        return sFullHomeTeam;
    }

    /**
     * 
     * @param sFullHomeTeam
     *     The sFullHomeTeam
     */
    public void setSFullHomeTeam(String sFullHomeTeam) {
        this.sFullHomeTeam = sFullHomeTeam;
    }

    /**
     * 
     * @return
     *     The homeTeamAbbr
     */
    public String getHomeTeamAbbr() {
        return homeTeamAbbr;
    }

    /**
     * 
     * @param homeTeamAbbr
     *     The home_team_abbr
     */
    public void setHomeTeamAbbr(String homeTeamAbbr) {
        this.homeTeamAbbr = homeTeamAbbr;
    }

    /**
     * 
     * @return
     *     The sFullAwayTeam
     */
    public String getSFullAwayTeam() {
        return sFullAwayTeam;
    }

    /**
     * 
     * @param sFullAwayTeam
     *     The sFullAwayTeam
     */
    public void setSFullAwayTeam(String sFullAwayTeam) {
        this.sFullAwayTeam = sFullAwayTeam;
    }

    /**
     * 
     * @return
     *     The awayTeamAbbr
     */
    public String getAwayTeamAbbr() {
        return awayTeamAbbr;
    }

    /**
     * 
     * @param awayTeamAbbr
     *     The away_team_abbr
     */
    public void setAwayTeamAbbr(String awayTeamAbbr) {
        this.awayTeamAbbr = awayTeamAbbr;
    }

    /**
     * 
     * @return
     *     The fixtureDate
     */
    public String getFixtureDate() {
        return fixtureDate;
    }

    /**
     * 
     * @param fixtureDate
     *     The fixture_date
     */
    public void setFixtureDate(String fixtureDate) {
        this.fixtureDate = fixtureDate;
    }

}
