
/* First created by JCasGen Sat Jun 18 15:55:46 CEST 2016 */
package de.mpg.mpi_inf.ambiversenlu.nlu.ner.uima.type;

import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Jun 22 11:00:00 CEST 2016
 *  */
public class UiucWikiArtWork_Type extends Annotation_Type {
  /**
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}

  private final FSGenerator fsGenerator =
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (UiucWikiArtWork_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = UiucWikiArtWork_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new UiucWikiArtWork(addr, UiucWikiArtWork_Type.this);
  			   UiucWikiArtWork_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new UiucWikiArtWork(addr, UiucWikiArtWork_Type.this);
  	  }
    };

  @SuppressWarnings ("hiding")
  public final static int typeIndexID = UiucWikiArtWork.typeIndexID;
    @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("UiucWikiArtWork");



  /** initialize variables to correspond with Cas Type and Features
	 *
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public UiucWikiArtWork_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    