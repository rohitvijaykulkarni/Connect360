/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.consentmgmt.dto;
// Generated Sep 21, 2017 1:52:20 PM by Hibernate Tools 5.1.0.Beta1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ibm.gbs.util.Constant;

/**
 * PgStatStatements generated by hbm2java
 */
@Entity
@Table(name = "pg_stat_statements", schema = Constant.SCHEMANAME )
public class PgStatStatements implements java.io.Serializable {

	private PgStatStatementsId id;

	public PgStatStatements() {
	}

	public PgStatStatements(PgStatStatementsId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "userid", column = @Column(name = "userid")),
			@AttributeOverride(name = "dbid", column = @Column(name = "dbid")),
			@AttributeOverride(name = "queryid", column = @Column(name = "queryid")),
			@AttributeOverride(name = "query", column = @Column(name = "query")),
			@AttributeOverride(name = "calls", column = @Column(name = "calls")),
			@AttributeOverride(name = "totalTime", column = @Column(name = "total_time", precision = 17, scale = 17)),
			@AttributeOverride(name = "minTime", column = @Column(name = "min_time", precision = 17, scale = 17)),
			@AttributeOverride(name = "maxTime", column = @Column(name = "max_time", precision = 17, scale = 17)),
			@AttributeOverride(name = "meanTime", column = @Column(name = "mean_time", precision = 17, scale = 17)),
			@AttributeOverride(name = "stddevTime", column = @Column(name = "stddev_time", precision = 17, scale = 17)),
			@AttributeOverride(name = "rows", column = @Column(name = "rows")),
			@AttributeOverride(name = "sharedBlksHit", column = @Column(name = "shared_blks_hit")),
			@AttributeOverride(name = "sharedBlksRead", column = @Column(name = "shared_blks_read")),
			@AttributeOverride(name = "sharedBlksDirtied", column = @Column(name = "shared_blks_dirtied")),
			@AttributeOverride(name = "sharedBlksWritten", column = @Column(name = "shared_blks_written")),
			@AttributeOverride(name = "localBlksHit", column = @Column(name = "local_blks_hit")),
			@AttributeOverride(name = "localBlksRead", column = @Column(name = "local_blks_read")),
			@AttributeOverride(name = "localBlksDirtied", column = @Column(name = "local_blks_dirtied")),
			@AttributeOverride(name = "localBlksWritten", column = @Column(name = "local_blks_written")),
			@AttributeOverride(name = "tempBlksRead", column = @Column(name = "temp_blks_read")),
			@AttributeOverride(name = "tempBlksWritten", column = @Column(name = "temp_blks_written")),
			@AttributeOverride(name = "blkReadTime", column = @Column(name = "blk_read_time", precision = 17, scale = 17)),
			@AttributeOverride(name = "blkWriteTime", column = @Column(name = "blk_write_time", precision = 17, scale = 17)) })
	public PgStatStatementsId getId() {
		return this.id;
	}

	public void setId(PgStatStatementsId id) {
		this.id = id;
	}

}
