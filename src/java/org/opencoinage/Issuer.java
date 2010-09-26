package org.opencoinage;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * A digital currency issuer.
 */
public class Issuer {
  public static final String RDF_TYPE = Vocabulary.BASE + "Issuer";

  /**
   * The URI identifying this issuer.
   *
   * @see java.net.URI
   */
  public final URI uri;

  /**
   * @param uri a valid URI identifying the issuer
   * @throws URISyntaxException if <code>uri</code> is not a valid URI
   */
  public Issuer(final String uri) throws URISyntaxException {
    this.uri = new URI(uri);
  }

  /**
   * @param uri a valid URI identifying the issuer
   */
  public Issuer(final URI uri) {
    this.uri = uri;
  }
}
