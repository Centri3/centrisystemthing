Planet	"Rock/Lercurnis B III"
{
	ParentBody     "Kond"
	Class          "Terra"
	Mass            0.0070733
	Radius          1300
	InertiaMoment   0.38017
	Obliquity       3
	EqAscendNode    -140.15
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_rock.cfg"
		SurfStyle       0.2559
		Randomize      (-0.580, 0.533, -0.025)
		colorDistMagn   0.058321
		colorDistFreq   189.18
		detailScale     128
		drivenDarkening 0
		seaLevel        -0.12977
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1.3588
		icecapHeight    0.53673
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.28432
		heightTempGrad  0.625
		beachWidth      0.001169
		tropicWidth     0.07
		mainFreq        1.9996
		venusFreq       1.3748
		venusMagn       0
		mareFreq        0.040169
		mareDensity     0.10536
		terraceProb     0.35113
		erosion         0
		montesMagn      0.05
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.0039411
		dunesFreq       7.8783
		dunesFraction   0.74625
		hillsMagn       1.0687
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      4.2315
		riversFreq      3.884
		riversSin       7.1753
		riftsMagn       4.2096
		riftsFreq       4.1046
		riftsSin        5.0904
		eqridgeMagn     0.51908
		eqridgeWidth    1
		eqridgeModMagn  2.5
		eqridgeModFreq  1.8321
		canyonsMagn     0.050567
		canyonsFreq     0.40976
		canyonsFraction 0.58772
		cracksMagn      0
		cracksFreq      15
		cracksOctaves   15
		craterMagn      1
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0.81679
		volcanoMagn     0
		volcanoFreq     0.32061
		volcanoDensity  0.17557
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   1
		volcanoTemp     1374
		lavaCoverTidal  0
		lavaCoverSun    0.04
		lavaCoverYoung  0
		BumpHeight      27.717
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

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.012338899
		SemiMajorAxis   0.0230080876
		Eccentricity    0.0763358779
		Inclination     3
		AscendingNode   -140.152672
		ArgOfPericenter -167.633588
		MeanAnomaly     25
	}
}

