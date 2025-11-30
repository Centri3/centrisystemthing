Planet	"Rock/Lercurnis B III"
{
	ParentBody     "Kond"
	Class          "Terra"
	Mass            0.00707329996
	Radius          1300
	InertiaMoment   0.380169988
	Obliquity       3
	EqAscendNode    -140.152672
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_rock.cfg"
		SurfStyle       0.256
		Randomize      (-0.580, 0.533, -0.025)
		colorDistMagn   0.0583
		colorDistFreq   189
		detailScale     128
		drivenDarkening 0
		seaLevel        -0.13
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1.36
		icecapHeight    0.537
		climatePole     0.438
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.284
		heightTempGrad  0.625
		beachWidth      0.00117
		tropicWidth     0.07
		mainFreq        2
		venusFreq       1.37
		venusMagn       0
		mareFreq        0.0402
		mareDensity     0.105
		terraceProb     0.351
		erosion         0
		montesMagn      0.05
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.00394
		dunesFreq       7.88
		dunesFraction   0.746
		hillsMagn       1.07
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      4.23
		riversFreq      3.88
		riversSin       7.18
		riftsMagn       4.21
		riftsFreq       4.1
		riftsSin        5.09
		eqridgeMagn     0.519
		eqridgeWidth    1
		eqridgeModMagn  2.5
		eqridgeModFreq  1.83
		canyonsMagn     0.0506
		canyonsFreq     0.41
		canyonsFraction 0.588
		cracksMagn      0
		cracksFreq      15
		cracksOctaves   15
		craterMagn      1
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0.817
		volcanoMagn     0
		volcanoFreq     0.321
		volcanoDensity  0.176
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   1
		volcanoTemp     1.37e+03
		lavaCoverTidal  0
		lavaCoverSun    0.04
		lavaCoverYoung  0
		BumpHeight      27.7
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
		TempMapMaxTemp  1e+05
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0100746688
		SemiMajorAxis   0.0230080876
		Eccentricity    0.0763358779
		Inclination     3
		AscendingNode   -140.152672
		ArgOfPericenter -167.633588
		MeanAnomaly     25
	}
}

