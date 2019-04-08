<?php
/**
 * The base configuration for WordPress
 *
 * The wp-config.php creation script uses this file during the
 * installation. You don't have to use the web site, you can
 * copy this file to "wp-config.php" and fill in the values.
 *
 * This file contains the following configurations:
 *
 * * MySQL settings
 * * Secret keys
 * * Database table prefix
 * * ABSPATH
 *
 * @link https://codex.wordpress.org/Editing_wp-config.php
 *
 * @package WordPress
 */

// ** MySQL settings - You can get this info from your web host ** //
/** The name of the database for WordPress */
define( 'DB_NAME', 'wordpress' );

/** MySQL database username */
define( 'DB_USER', 'root' );

/** MySQL database password */
define( 'DB_PASSWORD', 'root' );

/** MySQL hostname */
define( 'DB_HOST', 'localhost' );

/** Database Charset to use in creating database tables. */
define( 'DB_CHARSET', 'utf8mb4' );

/** The Database Collate type. Don't change this if in doubt. */
define( 'DB_COLLATE', '' );

/**#@+
 * Authentication Unique Keys and Salts.
 *
 * Change these to different unique phrases!
 * You can generate these using the {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}
 * You can change these at any point in time to invalidate all existing cookies. This will force all users to have to log in again.
 *
 * @since 2.6.0
 */
define( 'AUTH_KEY',         '_;(oO U>b9?@G1?%<d^r#!$97wBF-2Jjf!C{{XnhB{`b(3<1k nt_:Ds-7)E&MZc' );
define( 'SECURE_AUTH_KEY',  '!t&gbEyH5guW5[B>VIJ]hM>&Pf?[zE6~oj6 x2zs?_79MUthzHjwNk`o*9vBv6 F' );
define( 'LOGGED_IN_KEY',    '.P9HR|fz=vDb1`RImbx*]+)3WWpgve:+h>^N(N)[mPoyGjRM<z=UuRN]B)~)(A+8' );
define( 'NONCE_KEY',        'XJ1sms~cH/sf:E7Hw_|^0T3I<ghK]D>p3j2t{[8UhO`9FF(fmdMWY>:Q8]TDOD<e' );
define( 'AUTH_SALT',        'ty,>)0{JDCrXut[P[F@{vD2Bh*nU9B@9XY|v8aWjQz9Nx)~[^HUw(=|_?!B%rUC(' );
define( 'SECURE_AUTH_SALT', '20!`[$;jR%mf(v|PWzpLQ0|lCad5)M=wGx|usdwXB7N!AdCQqAI.)jF/R3f1EL_`' );
define( 'LOGGED_IN_SALT',   '5$7`65.CLe:DBCWG(F_w-G[/Ri]WD%:_LuGt!H6, {lmIBrx1/E/8w)J5HJ~f+C~' );
define( 'NONCE_SALT',       'iT/LpF>eb^U@;#}|gzW`uTo=>oe&p3L2i[y-W} v!-JDBRyE5vG6J^B.LSs<sXp-' );

/**#@-*/

/**
 * WordPress Database Table prefix.
 *
 * You can have multiple installations in one database if you give each
 * a unique prefix. Only numbers, letters, and underscores please!
 */
$table_prefix = 'wp_';

/**
 * For developers: WordPress debugging mode.
 *
 * Change this to true to enable the display of notices during development.
 * It is strongly recommended that plugin and theme developers use WP_DEBUG
 * in their development environments.
 *
 * For information on other constants that can be used for debugging,
 * visit the Codex.
 *
 * @link https://codex.wordpress.org/Debugging_in_WordPress
 */
define( 'WP_DEBUG', false );

/* That's all, stop editing! Happy publishing. */

/** Absolute path to the WordPress directory. */
if ( ! defined( 'ABSPATH' ) ) {
	define( 'ABSPATH', dirname( __FILE__ ) . '/' );
}

/** Sets up WordPress vars and included files. */
require_once( ABSPATH . 'wp-settings.php' );
