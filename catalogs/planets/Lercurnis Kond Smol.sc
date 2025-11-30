Planet	"Smol/Lercurnis B I"
{
	ParentBody     "Kond"
	Class          "Ferria"
	Mass            0.0119000003
	Radius          1420
	InertiaMoment   0.372000009
	Oblateness      0.00282000005
	RotationOffset  85
	Obliquity       3
	EqAscendNode    120.900786
	TidalLocked     true

	AbsMagn         -0.546
	SlopeParam      6.28
	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  0.3

	Surface
	{
		Preset         "lercurnis_kond_smol.cfg"
		SurfStyle       0.0844
		Randomize      (1.023, 1.053, 0.809)
		colorDistMagn   0.0492
		colorDistFreq   177
		detailScale     32
		drivenDarkening -0.527
		seaLevel        -0.382
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  2
		icecapHeight    0.466
		climatePole     0.438
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.204
		heightTempGrad  0.625
		beachWidth      0.0011
		tropicWidth     0.07
		mainFreq        1.37
		venusFreq       2
		venusMagn       1.14
		mareFreq        1
		mareDensity     0.351
		terraceProb     0.3
		erosion         0
		montesMagn      0.1
		montesFreq      5
		montesSpiky     1
		montesFraction  1
		dunesMagn       0
		dunesFreq       13
		dunesFraction   0.573
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      0
		riversFreq      3.08
		riversSin       6.77
		riftsMagn       0
		riftsFreq       2.49
		riftsSin        6.36
		eqridgeMagn     0.351
		eqridgeWidth    1
		eqridgeModMagn  2.5
		eqridgeModFreq  2.75
		canyonsMagn     0
		canyonsFreq     0.418
		canyonsFraction 0.742
		cracksMagn      0
		cracksFreq      1
		cracksOctaves   15
		craterMagn      1
		craterFreq      5
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0
		volcanoFreq     1
		volcanoDensity  1
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    0.977
		volcanoRadius   1
		volcanoTemp     2.34e+03
		lavaCoverTidal  0.305
		lavaCoverSun    0.298
		lavaCoverYoung  0
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
		TempMapMaxTemp  5.25e+04
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	Aurora
	{
		Height         108
		NorthLat       60
		NorthLon       0
		NorthRadius    1.4e+03
		NorthWidth     1.41e+03
		NorthRings     4
		NorthBright    0.437
		NorthFlashFreq 2.87
		NorthMoveSpeed 10
		NorthParticles 10000
		SouthLat       -60
		SouthLon       180
		SouthRadius    1.39e+03
		SouthWidth     1.4e+03
		SouthRings     4
		SouthBright    0.15
		SouthFlashFreq 3.03
		SouthMoveSpeed 10
		SouthParticles 100000
		TopColor    (0.641 1.000 0.000)
		BottomColor (1.000 0.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0025186675
		SemiMajorAxis   0.00913076653
		Eccentricity    0.05
		Inclination     3
		AscendingNode   120.900786
		ArgOfPericenter -70.156256
		MeanAnomaly     -53.6294469
	}
}

