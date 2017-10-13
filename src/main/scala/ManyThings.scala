
//noinspection ScalaFileName
trait GenericMatchedID {
}


trait Providing extends GenericMatchedID {
  trait Providable {
  }

  trait Provider {

  }

}




trait Building extends GenericMatchedID{
  trait Builder {
  }

  trait Buidlable {
  }

  trait PartialBuilding extends GenericMatchedID{

    trait PartiallyBuildable {
    }

    trait PartialBuilder extends Builder {
    }

  }
}
